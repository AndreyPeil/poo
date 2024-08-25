
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um produto de exemplo
        produto p = new produto("Camiseta", 50.0f, 100);

        int escolha;
        do {
            // Exibe o menu de opções
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Adicionar ao estoque");
            System.out.println("2 - Remover do estoque");
            System.out.println("3 - Ajustar preço");
            System.out.println("4 - Mostrar informações do produto");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Quantidade para adicionar: ");
                    int quantidadeAdicionar = scanner.nextInt();
                    p.adicionar(quantidadeAdicionar);
                    break;

                case 2:
                    System.out.print("Quantidade para remover: ");
                    int quantidadeRemover = scanner.nextInt();
                    p.remover(quantidadeRemover);
                    break;

                case 3:
                    System.out.print("Percentual para ajustar o preço: ");
                    float percentual = scanner.nextFloat();
                    p.ajustarPreco(percentual);
                    break;

                case 4:
                    System.out.println(p);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (escolha != 0);

        scanner.close();
    }
}

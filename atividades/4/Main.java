import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto product = null; 

        while (true) { 
            System.out.println("Armazem dos Guris");
            System.out.println("O que fazer: ");
            System.out.println("adicionar - 1");
            System.out.println("vender - 2");
            int intput = input.nextInt();

            switch (intput) {
                case 1:
                    System.out.println("Nome do produto: ");
                    String nome = input.next();
                    System.out.println("Preço do produto: ");
                    double preco = input.nextDouble();
                    System.out.println("Quantidade do produto: ");
                    int quantidade = input.nextInt();
                    product = new Produto(nome, preco, quantidade);  
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    if (product != null) {  
                        System.out.println("quantidade a vender: ");
                        int quantidade_venda = input.nextInt();
                        product.vender(quantidade_venda);
                    } else {
                        System.out.println("Nenhum produto adicionado ainda.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

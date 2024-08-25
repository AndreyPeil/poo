import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("O que fazer?");
            System.out.println("1 - Adicionar pedido");
            System.out.println("2 - Sair");
            System.out.println("3 - mostrar pedidos");
            int escolha = input.nextInt();
            input.nextLine();  

            switch (escolha) {
                case 1:
                    System.out.println("Qual o número do pedido?");
                    String numero = input.nextLine();  
                    System.out.println("Qual a data do pedido?");
                    String data = input.nextLine();  

                    Perdido pedido = new Perdido(numero, data);

                    while (true) {
                        System.out.println("Adicionar item ao pedido?");
                        System.out.println("1 - Sim");
                        System.out.println("2 - Não");
                        int adicionarItem = input.nextInt();
                        input.nextLine();  

                        if (adicionarItem == 1) {
                            System.out.println("Qual o nome do produto?");
                            String produto = input.nextLine();

                            System.out.println("Qual a quantidade?");
                            int quantidade = input.nextInt();

                            System.out.println("Qual o preço unitário?");
                            double preco = input.nextDouble();
                            input.nextLine();  
                            

                            ItemPerdido item = new ItemPerdido(produto, quantidade, preco);
                            pedido.adicionarItem(item);
                        } else if (adicionarItem == 2) {
                            break;
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }

                    double valorTotal = pedido.calcularValorTotal();
                    System.out.println("Valor Total do Pedido: R$ " + valorTotal);
                    break;

                case 2:
                    System.out.println("Saindo...");
                    input.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

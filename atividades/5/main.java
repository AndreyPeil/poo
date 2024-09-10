import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastro de Funcionário");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cargo (Estagiário, Junior, Pleno, Senior): ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, cargo, salario);

        
        int opcao = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Exibir dados do funcionário");
            System.out.println("2. Aumentar salário");
            System.out.println("3. Promover funcionário");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    funcionario.exibirDados();
                    break;
                case 2:
                    System.out.print("Digite o percentual de aumento (máx 20%): ");
                    double percentual = scanner.nextDouble();
                    Funcionario.aumentarSalario(funcionario, percentual);
                    break;
                case 3:
                    funcionario.promover();
                    break;
                case 4:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}

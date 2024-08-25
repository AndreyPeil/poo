import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<funcionario> funcionarios = new ArrayList<>();
        funcionario func = new funcionario();

        while (true) { 
            System.out.println("O que você deseja fazer: ");
            System.out.println("1 - Contratar");
            System.out.println("2 - Demitir");
            System.out.println("3 - Folha salarial");
            System.out.println("4 - Sair");
            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    func.contratar(funcionarios);
                    break;
                case 2:
                    func.demitir(funcionarios);
                    break;
                case 3:
                    func.folha_salario(funcionarios);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    input.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

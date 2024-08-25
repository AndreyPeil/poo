import java.util.List;
import java.util.Scanner;

public class funcionario {
    int id;
    double salario;

    public void contratar(List<funcionario> funcionarios) {
        Scanner func_dado = new Scanner(System.in);
        System.out.println("Contratar: ");
        System.out.println("Qual o ID: ");
        id = func_dado.nextInt();
        System.out.println("Qual o salário: ");
        salario = func_dado.nextDouble();
        funcionario novoFuncionario = new funcionario();
        novoFuncionario.id = this.id;
        novoFuncionario.salario = this.salario;
        funcionarios.add(novoFuncionario);
        System.out.println("Funcionário contratado com ID: " + id + " e salário: " + salario);
    }

    public void demitir(List<funcionario> funcionarios) {
        Scanner func_dado = new Scanner(System.in);
        System.out.println("Demitir: ");
        System.out.println("Qual o ID: ");
        int id = func_dado.nextInt();
        boolean encontrado = false;
        for (funcionario f : funcionarios) {
            if (f.id == id) {
                funcionarios.remove(f);
                System.out.println("Funcionário com ID: " + id + " demitido.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Funcionário com ID: " + id + " não encontrado.");
        }
    }

    public void folha_salario(List<funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário na empresa.");
        } else {
            System.out.println("Folha salarial: ");
            for (funcionario f : funcionarios) {
                System.out.println("ID: " + f.id + ", Salário: " + f.salario);
            }
        }
    }
}

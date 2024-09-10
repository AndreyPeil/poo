public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return this.salario;
    }

    // Método para aumentar o salário com verificação de percentual
    public static void aumentarSalario(Funcionario funcionario, double percentual) {
        if (percentual > 0 && percentual <= 20) {
            funcionario.salario += funcionario.getSalario() * percentual / 100;
        } else {
            System.out.println("O aumento não pode ser maior que 20% e nem negativo");
        }
    }

    public void promover() {
        if (this.cargo.equals("Estagiário")) {
            this.cargo = "Junior";
        } else if (this.cargo.equals("Junior")) {
            this.cargo = "Pleno";
        } else if (this.cargo.equals("Pleno")) {
            this.cargo = "Senior";
        } else {
            System.out.println("Nenhuma promoção disponível para o cargo atual.");
        }
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$" + String.format("%.2f", salario));
    }
}

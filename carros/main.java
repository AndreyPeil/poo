import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // Criação de instância de Motor e atribuição ao Veiculo
        motor motor = new motor();
        veiculo mazda = new veiculo();
        mazda.motor = motor;

        // Criação do Scanner para ler a entrada do usuário
        System.out.println("Ligar o carro? (y/n): ");
        Scanner input = new Scanner(System.in);
        String escolha = input.next();

        // Verificação da escolha do usuário
        if (escolha.equals("y")) {
            mazda.ligado();
        } else if (escolha.equals("n")) {
            mazda.desligado();
        } else {
            System.out.println("Errmm, what a sigma?");
        }

        // Exibição das informações do veículo
        System.out.println("Especificações: ");
        System.out.println("Modelo: " + mazda.modelo);
        System.out.println("Ano: " + mazda.ano);
        System.out.println("Marca: " + mazda.marca);
        System.out.println("Potência do motor: " + mazda.motor.potencia);
        System.out.println("Estado do motor: " + mazda.motor.estado);
        System.out.println("Combustível do motor: " + mazda.motor.combustivel);
    }
}

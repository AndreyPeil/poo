import java.util.Scanner;

public class carro {  
    String modelo;
    String marca;
    int ano;
    double kms;  

    // Construtor para inicializar os atributos
    public carro(String marca, String modelo, int ano, double kms) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.kms = kms;
    }

    // Método para alterar a quilometragem total
    public void alterarKmsTotal() {  // Corrigi o nome do método
        System.out.println("Alterar KMs total ");
        System.out.print("Quantidade Total: ");
        Scanner input = new Scanner(System.in);

        double km = input.nextDouble();  // Corrigi o tipo de dados e o uso de scanner

        if (km >= 0) {
            this.kms = km;
            System.out.println("Quilometragem atualizada para: " + this.kms + " KMs");
        } else {
            System.out.println("A quilometragem não pode ser negativa.");
        }
    }

    // Método para registrar a quilometragem de uma viagem
    public void trip() {
        System.out.println("Registrar quilometragem da viagem");
        System.out.print("Quilômetros percorridos na viagem: ");
        Scanner input = new Scanner(System.in);

        double kmViagem = input.nextDouble();

        if (kmViagem > 0) {
            this.kms += kmViagem;
            System.out.println("Quilometragem total após a viagem: " + this.kms + " KMs");
        } else {
            System.out.println("A quilometragem da viagem deve ser positiva.");
        }
    }
}

import  java.util.*;

public class main{
    public static void main(String[] args) {
        carro carro = new carro("Toyota", "Corolla", 2020, 15000.0);
        Scanner input = new Scanner(System.in);

        do { 
            System.out.println("O que fazer: ");
            System.out.println("1  - Km total");
            System.out.println("2 - Viagem");
            System.out.println("3 - sair");

            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    carro.alterarKmsTotal();
                    break;
                
                case 2:
                    carro.trip();
                    break;
                
                case 3:
                    System.out.print("saindo...");
                    return;
            }
        } while (true);

    
    }
}

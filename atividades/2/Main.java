import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular: ");
        String titular = sc.nextLine();
        System.out.println("Digite o número da conta: ");
        String numeroConta = sc.nextLine();

        ContaBancaria conta = new ContaBancaria(titular, 0, numeroConta);


        
        do { 
            System.out.println("O que fazer: ");
            System.out.println("Depositar: 1");
            System.out.println("Sacar: 2");
            int escolha  = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Qual a quantidade: R$ ");
                    double quantidade = sc.nextDouble();
                    conta.depositar(quantidade);
                    System.out.println("Novo saldo: R$ " + conta.getSaldo());
                    break;
                case 2:
                    System.out.println("Qual a quantidade: R$ ");
                    quantidade = sc.nextDouble();
                    conta.sacar(quantidade);
                    System.out.println("Novo saldo: R$ " + conta.getSaldo());
                    break;

            }
        } while (true);
    }
}
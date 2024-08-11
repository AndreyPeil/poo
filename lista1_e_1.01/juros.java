import java.util.*;
public class juros{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor inicial: ");
        float val = input.nextFloat();

        System.out.println("Qual o percentual: ");
        float percent = input.nextFloat();

        System.out.println("Qual a qtd de meses: ");
        double meses = input.nextDouble();

        double SaldoF = val * Math.pow(1 + (percent / 100), meses);


        System.out.println("resultado: " + SaldoF);
    }
}

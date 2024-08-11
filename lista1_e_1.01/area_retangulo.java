import java.util.Scanner;

public class area_retangulo {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a base: ");

        float base = input.nextFloat();

        System.out.println("Qual a altura: ");

        float altura = input.nextFloat();

        System.out.println("A base é: " + base * altura);
    }
}
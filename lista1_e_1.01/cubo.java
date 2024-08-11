import java.util.Scanner;

public class cubo{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o valor da aresta: ");
        double a = input.nextFloat();

        System.out.println("O valor do volume: "+ Math.pow(a, 3));

        System.out.println("O valor da área: " + 6 * Math.pow(a,2));

    }
}
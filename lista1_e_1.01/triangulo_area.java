import java.util.Scanner;

public class triangulo_area {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor da base: ");
        float base = input.nextFloat();

        System.out.println("Qual a altura: ");
        float altura = input.nextFloat();


        System.out.println("A área é de: "+ base * altura / 2);



   } 
}
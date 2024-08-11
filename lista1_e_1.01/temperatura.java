import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em °C: ");
        float temp = input.nextFloat();
        
        
        float F = (180 * temp / 100) + 32;

        float K = temp + 273.15f;

        float Ra = F + 459.67f;

        System.out.println("Fahrenheit (°F): " + F);
        System.out.println("Kelvin (K): " + K);
        System.out.println("Rankine (°R): " + Ra);
    }
}

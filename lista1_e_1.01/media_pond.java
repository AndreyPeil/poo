import java.util.*;

public  class  media_pond{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a: ");
        float a = input.nextFloat();

        System.out.println("b: ");
        float b = input.nextFloat();

        System.out.println("c: ");
        float c = input.nextFloat();

        float maior = a;
        if (b > maior) {
            maior = b;
        }
        if (c > maior) {
            maior = c;
        }

        float mediaPonderada;

        if (maior == a) {
            mediaPonderada = ((a * 4) + (b * 3) + (c * 3)) / 10;
        } else if (maior == b) {
            mediaPonderada = ((a * 3) + (b * 4) + (c * 3)) / 10;
        } else {
            mediaPonderada = ((a * 3) + (b * 3) + (c * 4)) / 10;
        }

        System.out.println("A média ponderada é: " + mediaPonderada);
        System.out.println("maior: " + maior);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

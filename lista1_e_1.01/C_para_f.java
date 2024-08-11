import  java.util.*;
public class C_para_f{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a temp em C: ");

        float C = input.nextFloat();

        float F = ((180 * C) / 100) + 32;

        System.out.println("F: "+ F);
    }
}

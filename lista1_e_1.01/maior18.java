import java.util.Scanner;

public class maior18{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a sua idade: ");
        int idade = input.nextInt();

        if(idade >= 18){
            System.out.println("é maior!");
        }else{
            System.out.println("não é maior!");
        }
    }
}
import java.util.Scanner;

public class ver_nota{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual a sua nota: ");
        float nota = input.nextFloat();

        if(nota < 6){
            System.out.print("Reprovado");
        }else{
            System.out.print("Aprovado");
        }

    }
}
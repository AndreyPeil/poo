
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class media{

    public static void main(String[] args) {
        
        List<Float> list = new ArrayList<Float>();

        Scanner input = new Scanner(System.in);
        System.out.println("primeira nota: ");

        float nota1 = input.nextFloat();

        list.add(nota1);

        System.out.println("segunda nota: ");

        float nota2 = input.nextFloat();

        list.add(nota2);

        System.out.println("terceira nota: ");

        float nota3 = input.nextFloat();

        list.add(nota3);

        float notaT = 0;
        for(int nota = 0; nota < list.size(); nota++  ){
            notaT += list.get(nota);
        }

        System.out.print(notaT / list.size());





    }
}
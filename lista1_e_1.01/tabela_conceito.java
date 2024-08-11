import java.util.*;

public class tabela_conceito{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Float> nota_list = new ArrayList<Float>();

        //pega as nota e add no array
        for(int i = 0; i < 3; i++){
            System.out.println("Qual sua nota: ");
            float nota = input.nextFloat();
            nota_list.add(nota);

        }

       //codigo meio feio mas ele faz a media
        float notaT = 0;
        for(int nota = 0; nota < nota_list.size(); nota++  ){
            notaT += nota_list.get(nota);
        }
        float media = notaT / nota_list.size();

        //ver faltas
        System.out.println("Quantas faltas: ");
        int falta = input.nextInt();

        //validações
        if(falta > 5 || media < 6){
            int conceito = 0;
            System.out.print(conceito);
        }else{
            if (media >= 6 && media < 7) {
                int conceito = 1;
                System.out.println(conceito);

            }else if(media >= 7 && media < 8){
                int conceito = 2;
                System.out.print(conceito);
            }else if(media >= 8 && media < 9){
                int conceito = 3;
                System.out.print(conceito);
            }else if(media >= 9){
                int conceito = 4;
                System.out.print(conceito);
            }
        }
    }
}
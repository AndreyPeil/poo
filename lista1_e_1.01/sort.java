import java.util.*;

public class sort{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Float> numbers = new ArrayList<Float>();

        for(int i = 0; i <= 1; i++){
            System.out.println("coloque o número: ");
            float num = input.nextFloat();
            numbers.add(num);
        }
        Collections.sort(numbers);
        System.out.println("Sort: "+ numbers);
    }
}
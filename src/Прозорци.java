
import java.util.Scanner;
import java.util.stream.*;

public class Прозорци {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();
        int a;
        int[] array = new int[n];
        for (a = 0; a < n; a++) {
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            if (d == 1) {
                array[a] = b * c * p;
            }
        }


        int sum = IntStream.of(array).sum();
        System.out.println(sum);

    }
}

import java.util.Arrays;
import java.util.Scanner;

public class PrimeToN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int z = n;
        int i;
        int b = 0;
        int[] array = new int[n];
        System.out.print("1 ");

        while (n > 1) {
            for (i = 2; i < n; i++) {
                int a = n % i;
                if (a == 0) {
                    i = 2;
                    n = n - 1;
                }
            }

            array[b] = n;
            b = b + 1;
            n = n - 1;
        }
        Arrays.sort(array);

        for (i = 0; i < z; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }


    }
}


import java.lang.*;
import java.util.Scanner;

public class MaxSumOfSubsequence {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //String[] str = input.nextLine().split("");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            sum = 0;
            sum = arr[i];
            for (int j = i + 1; j < n; j++) {
                sum = sum + arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println(max);


    }
}


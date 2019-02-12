import java.util.Scanner;

public class Парола {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        int k = scann.nextInt();
        int[] arr = new int[6];
        for (int i = 5; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        int n = 5;
        for (int j = 0; j < 3; j++) {
            int temp = arr[j];
            arr[j] = arr[j + n];
            arr[j + n] = temp;
            n -= 2;
        }
        n = 1;
        int newNumber = 0;
        for (int ii = 0; ii < 6; ii++) {
            newNumber += arr[5 - ii] * n;
            n *= 10;
        }
        n = 0;
        n = newNumber / k;
        newNumber %= k;
        System.out.println(n + newNumber);
    }
}

import java.util.Scanner;

public class BiggestPrimeNumber {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        boolean isPrime = true;
        int primeNumber = 0;
        for (int i = n; i >= 2; i--) {
            for (int j = 2; j <= i / j; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeNumber = i;
                break;
            }else isPrime = true;
        }
        System.out.println(primeNumber);
    }
}

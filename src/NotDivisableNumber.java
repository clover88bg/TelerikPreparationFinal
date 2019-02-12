import java.util.Scanner;

public class NotDivisableNumber {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        for (int i = 1; i <= number ; i++) {
            if(i % 3 == 0 || i % 7 == 0);
            else System.out.print(i + " ");
        }
    }
}

import java.util.Scanner;

public class NumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print( i + " ");
        }
    }
}

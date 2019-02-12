import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        long number = scann.nextLong();
        String numAsString = "" + Long.toHexString(number) ;

        System.out.println(numAsString.toUpperCase());
    }
}
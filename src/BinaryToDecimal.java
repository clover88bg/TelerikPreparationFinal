import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        long number = Long.parseLong(str,2);
        System.out.println(number);
    }
}

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        long number = scann.nextLong();
        System.out.println(Long.toBinaryString(number));
    }
}

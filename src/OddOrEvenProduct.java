import java.util.Scanner;

public class OddOrEvenProduct {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String num  = scann.nextLine();
        int number = Integer.parseInt(num);
        String str = scann.nextLine();
        int [] arr = new int[number];
        int j = 0;
        for (int i = 0; j < number; i++) {
            if (Character.isDigit(str.charAt(i))) {
                arr[j] = str.charAt(i) - '0';
                j++;
            }
        }
        double sumOdd = 1;
        double sumEven = 1;
        int counter = 1;
        for (int i = 0; i <number; i++) {
            counter++;
            if( counter %2 == 0) sumEven *= arr[i];
            else sumOdd *= arr[i];
        }
        if (sumEven == sumOdd) System.out.printf("yes %.0f", sumEven );
        else System.out.printf("no %.0f %.0f",sumEven, sumOdd);
    }
}

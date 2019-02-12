import java.util.Scanner;

public class CalculateFAct {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        double numberOne = scann.nextDouble();
        double numberTwo = scann.nextDouble();
        double sumOne = 1;
        double sumTotal = 1;
        for (int i = 1; i <= numberOne ; i++) {
            sumOne = 1;
            for (int j = i; j > 0 ; j--) {
                sumOne *= j;
            }
            sumTotal += sumOne/Math.pow(numberTwo,i);
        }
        System.out.printf("%.5f",sumTotal);
    }
}

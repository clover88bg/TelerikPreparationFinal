import java.math.BigInteger;
import java.util.Scanner;


public class CatalanNumber {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int num1 = scann.nextInt();
        int sum1 = 1;
        int sum2 = 1;
        int sum3 = 1;
        int totalsum = 0;
        BigInteger sumOne = BigInteger.valueOf(sum1);
        BigInteger sumTwo = BigInteger.valueOf(sum2);
        BigInteger sumThree = BigInteger.valueOf(sum3);
        BigInteger sumTotal = BigInteger.valueOf(totalsum);
        for (int i = num1 *2; i > 0; i--) {
            BigInteger counter = BigInteger.valueOf(i);
            sumOne = counter.multiply(sumOne);
        }
        for (int i = num1 +1; i > 0; i--) {
            BigInteger counter = BigInteger.valueOf(i);
            sumTwo = counter.multiply(sumTwo);
        }
        for (int i = num1; i > 0; i--) {
            BigInteger counter = BigInteger.valueOf(i);
            sumThree = counter.multiply(sumThree);
        }
        sumTotal = sumOne.divide(sumTwo.multiply(sumThree));
        System.out.println(sumTotal);
    }
}

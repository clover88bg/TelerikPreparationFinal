
import java.util.Arrays;
import java.util.Scanner;

public class MInMaxSumAverage {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int numberOfLines = scann.nextInt();
        double[] numbers = new double[numberOfLines];
        for (int i = 0; i < numberOfLines; i++) {
            numbers[i] = scann.nextDouble();
        }
        Arrays.sort(numbers);
        double sum = 0;
        for (int i = 0; i < numberOfLines; i++) {
            sum += numbers[i];
        }
        System.out.printf("min=%.2f\n", numbers[0]);
        System.out.printf("max=%.2f\n", numbers[numberOfLines - 1]);
        System.out.printf("sum=%.2f\n", sum);
        System.out.printf("avg=%.2f\n", sum / numberOfLines);
    }
}

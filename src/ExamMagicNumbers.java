import java.util.Scanner;

public class ExamMagicNumbers {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int [] arr = new int [5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scann.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 7 == 0){
                sum += arr[i];
            }
        }
        int numbersSum = 0;
        while (sum > 9){
            numbersSum += sum%10;
            sum = sum/10;
        }
        numbersSum += sum;
        System.out.println(numbersSum);
    }
}

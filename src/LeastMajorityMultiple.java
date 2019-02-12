import java.util.Scanner;

public class LeastMajorityMultiple {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = scann.nextInt();
        }
        int result = 0;
        int tempResult = 0;
         for (int i = 0; i < 4; i++) {
            int m = arr[i];
            int num1 = m;
            int n = arr[i+1];
            int num2 = n;
            while (num1 != num2) {
                if (num1 < num2) {
                    num1 = num1 + m;
                } else {
                    num2 = num2 + n;
                }
            }
            tempResult = num1;
            if (tempResult < result) result = tempResult;
        }
        System.out.println(result);
    }

}

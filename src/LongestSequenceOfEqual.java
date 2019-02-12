import java.util.Scanner;

public class LongestSequenceOfEqual {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scann.nextInt();
        }

        int maxSequence = 0;
        int tempSequence = 1;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] == arr[j + 1]) {
                tempSequence++;
            } else {
                if (tempSequence > maxSequence) maxSequence = tempSequence;
                tempSequence = 1;
            }
        }
        if (n == 2 && arr[0] == arr[1]) System.out.println(2);
        else {
            if (tempSequence > maxSequence) maxSequence = tempSequence;
            System.out.println(maxSequence);
        }
    }
}

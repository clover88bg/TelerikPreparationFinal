import java.util.Arrays;
import java.util.Scanner;

public class MaxSumOfKElements {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        int k = scann.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scann.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int j = arr.length -1; j >=(arr.length - k) ; j--){
            sum += arr[j];
        }
        System.out.println(sum);
    }
}

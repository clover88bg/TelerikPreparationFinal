import java.util.Arrays;
import java.util.Scanner;

public class Ранкове {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String num = scann.nextLine();
        int number = Integer.parseInt(num);
        String str = scann.nextLine();
        String [] str2 = str.split(" ");
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] =Integer.parseInt(str2[i]);
        }
        int [] arr2 = Arrays.copyOf(arr,number);
        int temp = Integer.MIN_VALUE;
        int trank = 0;
        int rank = 1;
        for (int j = 0; j < number; j++) {
            for (int k = 0; k < number; k++) {
                if ( arr[k] > temp ) {
                    temp = arr[k];
                    trank = k;
                }
            }
            arr2[trank] = rank;
            arr[trank] = Integer.MIN_VALUE;
            rank++;
            temp = Integer.MIN_VALUE;
            trank = 0;
        }
        for (int m : arr2) {
            System.out.print(m);
            System.out.print(" ");
        }
    }
}

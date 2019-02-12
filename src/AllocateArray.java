import java.util.Scanner;

public class AllocateArray {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int n = scann.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = (i*5);
        }
        for (int j=0; j<array.length;j++){
            System.out.println(array[j]);
        }
    }
}

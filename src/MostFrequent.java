import java.util.Arrays;
import java.util.Scanner;

public class MostFrequent {
    public static void main(String[] args) {
        Scanner scann =  new Scanner(System.in);
        int n = scann.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr [i] = scann.nextInt();
        }
        Arrays.sort(arr);
        int mostFrequent = 0;
        int tempMostFrequent = arr[0];
        int counter = 0;
        int tempcounter = 1;
        for (int j = 1; j < n ; j++){
            if( tempMostFrequent == arr[j] ){
                tempcounter++;
            }else {
                if (tempcounter > counter) {
                    mostFrequent = tempMostFrequent;
                    counter = tempcounter;
                }
                tempMostFrequent = arr[j];
                tempcounter = 1;
            }
        }
        if (n == 1) System.out.println(arr[0] + "(1 time)");
        else if (n == 2) System.out.println(arr[0] + "(" + n + " times)");
        else if (counter < tempcounter) System.out.printf("%d(%d times)",tempMostFrequent ,tempcounter);
        else System.out.printf("%d(%d times)",mostFrequent ,counter);
    }
}

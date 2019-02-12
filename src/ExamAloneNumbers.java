
import java.util.Scanner;

public class ExamAloneNumbers {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        String str = scann.nextLine();
        String []input = str.split(", ");
        int [] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int target = scann.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                if ( i > 0 && i < arr.length -1) {
                    if ( arr[i] != arr [i -1] && arr[i] != arr[i +1]){
                        arr[i] = Math.max(arr[i-1],arr[i+1]);
                    }
                }
            }
        }
        String s = "";
        System.out.print("[");
        for ( int j :arr){
            System.out.print(s + j);
            s = ", ";
        }
        System.out.println("]");
    }
}

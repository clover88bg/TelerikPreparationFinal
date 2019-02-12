

import java.util.Scanner;

public class LargestThanNeighborhoods {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String num = scann.nextLine();
        int number = Integer.parseInt(num);
        String str = scann.nextLine();
        String [] array = str.split(" ");
        int [] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        int counter = 0;
        for (int j = 1; j < number -1; j++) {
            if (arr[j] > arr[j+1] && arr[j] > arr[j-1])
                counter ++;
        }
        System.out.println(counter);
    }
}

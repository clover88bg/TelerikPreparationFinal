import java.util.Arrays;
import java.util.Scanner;

public class MissCat {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = scann.nextInt();
        }
        Arrays.sort(arr);
        int counter = 1;
        int tempCounter = 1;
        int tempCat = 0;
        int cat = 0;
        for (int j = number - 1; j > 0; j--) {
            if (arr[j] == arr[j - 1]) {
                tempCounter++;
                tempCat = arr[j];
            } else {
                if (tempCounter == counter){
                    if (cat > tempCat){
                        cat = tempCat;
                    }
                }
                if (tempCounter > counter) {
                    counter = tempCounter;
                    cat = tempCat;
                }
                tempCounter = 1;
                tempCat = 0;
            }
        }
        if (counter == 1) {
            if (number == 1) System.out.println(arr[0]);
            else if (number == 2) System.out.println(Math.max(arr[0], arr[1]));
            else System.out.println(arr[0]);
        } else {
            if (tempCounter == counter) {
                if (cat > tempCat) {
                    cat = tempCat;
                }
            }
            if (tempCounter > counter) {
                System.out.println(tempCat);
            } else
            System.out.println(cat);
        }
    }

}

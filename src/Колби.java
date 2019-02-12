import java.util.Scanner;

public class Колби {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int countOfFlasks = scann.nextInt();
        double amountOfPotion = scann.nextDouble();
        double[] arr = new double[countOfFlasks];
        arr[0] = 0;
        for (int i = 1; i < countOfFlasks; i++) {
            arr[i] = arr[i - 1] + i;
        }
        for (int j = 0; j < arr.length; j++) {
            if ((arr[j] >= amountOfPotion) && ((j + 1) % 2 != 0)) {
                System.out.println(j + 1);
                break;
            }
        }
    }
}


import java.util.Scanner;

public class MatrixOfNumbers {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = i +1; j < number+i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class ДобриЧисла {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        int startNumber = scann.nextInt();
        int endNumber = scann.nextInt();
        int counter = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (isGood(i))
                counter++;
        }
        System.out.println(counter);
    }
    private static boolean isGood(int number) {
        String numberAsString = Integer.toString(number);
        int[] arr = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            arr[i] = numberAsString.charAt(i) - '0';
        }
        boolean check = true;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                if (number % arr[j] != 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}

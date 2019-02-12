
import java.util.Scanner;

public class ТайноСъобщение {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String message = scann.nextLine();
        StringBuilder sb = new StringBuilder(10000);
        for (int i = 0; i < message.length() ; i++) {
            char c = message.charAt(i);
             if (c <= '/' || c >= ':'){
                sb.append(message.charAt(i));
            }
        }
        System.out.println(sb.reverse());
    }
}

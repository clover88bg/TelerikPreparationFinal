import java.util.Scanner;

public class PrintDeck {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String sign = scann.next();
        if (sign.equals("J")) sign = "11";
        if (sign.equals("Q")) sign = "12";
        if (sign.equals("K")) sign = "13";
        if (sign.equals("A")) sign = "14";
        int signAsInt = Integer.parseInt(sign);
        for (int i = 2; i <= signAsInt; i++) {
            if (i >=2 && i<= 10)
            System.out.println(i + " of spades, " + i + " of clubs, " + i + " of hearts, " + i + " of diamonds");
            else {
                if (i == 11) sign = "J";
                if (i == 12) sign = "Q";
                if (i == 13) sign = "K";
                if (i == 14) sign = "A";
                System.out.println(sign + " of spades, " + sign + " of clubs, " + sign + " of hearts, " + sign + " of diamonds");
            }
        }
    }
}

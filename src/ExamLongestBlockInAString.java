import java.util.Scanner;

public class ExamLongestBlockInAString {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String str = scann.nextLine();
        String[] newStr = new String[str.length()];
        newStr = str.split("");

        int maxSequence = 0;
        int tempSequence = 1;
        String subString = "";
        String tempString = "";
        for (int j = newStr.length - 1; j > 0; j--) {
            if (newStr[j].equals(newStr[j - 1])) {
                tempSequence++;
                if (tempString.equals("")) {
                    tempString = newStr[j] + newStr[j - 1];
                } else
                    tempString += newStr[j - 1];
            } else {
                if (tempSequence >= maxSequence) {
                    maxSequence = tempSequence;
                    tempSequence = 1;
                    subString = tempString;
                    tempString = "";
                }
                tempString = "";
                tempSequence = 1;
            }
        }
        if (newStr.length == 1) {
            subString= newStr[0];
        } else if (newStr.length == 2) {
            if (newStr[0].equals(newStr[1])) subString = newStr[0] + newStr[1];
            else
                subString = newStr[0];
        } else if (tempSequence >= maxSequence && tempSequence != 1) {
            subString = tempString;
        } else if (maxSequence == 1 && tempSequence == 1) {
            subString= newStr[0];
        }
        System.out.println(subString);
    }

}



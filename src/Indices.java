
import java.util.Scanner;


public class Indices {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String strNumber = scann.nextLine();
        int number = Integer.parseInt(strNumber);
        String input = scann.nextLine();
        String[] str = input.split(" ");
        int[] arr = new int[str.length];
        int[] arrSecond = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(0).append(" ");
        sb.append(arr[0]).append(" ");
        arrSecond[0] = arr[0];
        boolean cicle = false;
        int index = 0;
        for (int j = 0; arr[j]< arr.length; j++) {
            index = arr[arr[j]];
            if (index < 0) break;
            if (index > arr.length)break;
            for (int p = 0; p < arrSecond.length; p++) {
                if (arrSecond[p] == index) {
                    cicle = true;
                    break;
                }
            }
            if (cicle){
                sb.append("0");
                break;
            }
            sb.append(index).append(" ");
            arrSecond[j+1] = index;
        }

        if (cicle) {
            String[] strArr = sb.toString().split(" ");
            for (int n = 0; n < strArr.length; n++) {
                if (index == 0) index = 1;
                if ((Integer.toString(arrSecond[index-1])).equals(strArr[n])) {
                    System.arraycopy(strArr,n,strArr,n+1,strArr.length-n-1);
                    strArr[n] = "(" ;
                    break;
                }
            }
            int stopPause = 0;
            String s = "";
            for (String m : strArr) {
                stopPause = 0;
                if (m.contentEquals("(")) {
                    s = "";
                  stopPause = 1;
                }
                System.out.print(s + m);
                if(stopPause == 1) s = "";
                else s = " ";
            }
            System.out.println(")");
        }else
        System.out.println(sb.toString());
    }
}

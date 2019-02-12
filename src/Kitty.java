
import java.lang.reflect.Array;
import java.util.Scanner;

public class Kitty {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String staff = scann.nextLine();
        String move = scann.nextLine();
        move = "0 " + move;
        String[] staffList = staff.split("");
        String[] moveString = move.split(" ");

        int[] moveList = new int[moveString.length];

        for (int i = 0; i < moveString.length; i++) {
            moveList[i] = Integer.parseInt(moveString[i]);
        }
        int counter = -1;
        int position = 0;
        int coderSouls = 0;
        int food = 0;
        int deadlocks = 0;
        int moves = 0;
        String catched = "";
        for ( int j = 0; j < moveList.length; j++) {
            moves = moveList[j] + position;
            if (Math.abs(moves) >= staffList.length) {
                moves = moves % staffList.length;
            }
            if (moves < 0) {
                moves *= -1;
                moves = staffList.length - moves;
            }
            if (moves >= staffList.length) {
                moves = moves % staffList.length;
            }
            catched = (String) Array.get(staffList, moves);
            counter++;
            position = moves;
            if (catched.equals("@")) {
                coderSouls++;
                staffList[moves] = "";
            }
            if (catched.equals("*")) {
                food++;
                staffList[moves] = "";
            }
            if (catched.equals("x")) {
                deadlocks++;
                if ((moves) % 2 == 0) {
                    coderSouls--;
                    staffList[moves] = "@";
                    if (coderSouls < 0) break;
                } else {
                    food--;
                    staffList[moves] = "*";
                    if (food < 0) break;
                }
            }
//            catched = "";
        }
        if (coderSouls < 0 || food < 0) {
            System.out.println("You are deadlocked, you greedy kitty!");
            System.out.println("Jumps before deadlock: " + counter);
        } else {
            System.out.println("Coder souls collected: " + coderSouls);
            System.out.println("Food collected: " + food);
            System.out.println("Deadlocks: " + deadlocks);
        }
    }
}

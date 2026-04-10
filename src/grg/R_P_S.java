package grg;

import java.util.Random;
import java.util.Scanner;

public class R_P_S {
    public static void main(String[] args) {
        while (true) {
            int num, user;
            Random r = new Random();
            num = r.nextInt(1, 4);
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a value \n 1 is ROCK\n 2 is SCISSOR\n 3 is PAPER");
            user = sc.nextInt();
            if ((num == 1 && user == 2) || (num == 2 && user == 3) || (num == 3 && user == 1)) {
                System.out.println("Computer won the game");
            } else if ((user == 1 && num == 2) || (user == 2 && num == 3) || (user == 3 && num == 1)) {
                System.out.println("User won the game");
            } else if (user == num) {
                System.out.println("Match is tied");
            } else {
                System.out.println("Enter valid input");
            }
            if (num == 1) {
                System.out.println("Computer's choice is: Rock");
            } else if (num == 2) {
                System.out.println("Computer's choice is: Scissor");
            } else {
                System.out.println("Computer's choice is: Paper");
            }
        }
    }
}

package questions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q64 {
    /*
    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
    Return 0 if they both go over.
    blackjack(19, 21) → 21
    blackjack(21, 19) → 21
    blackjack(19, 22) → 19

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 2 number to start the game, or press double zero to quit the game");
            int a = input.nextInt();
            int b = input.nextInt();

            if(a==0 || b==0){
                break;
            } else if (a > 21 && b > 21) {
                System.out.println(0);
            } else if (a <= 21 && b > 21) {
                System.out.println(a);
            } else if (a > 21 && b <= 21) {
                System.out.println(b);
            } else if (a <= 21 && b <= 21) {
                if (a > b) {
                    System.out.println(a);
                } else {
                    System.out.println(b);
                }
            }

        }
    }




}

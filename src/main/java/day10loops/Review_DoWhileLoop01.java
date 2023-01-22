package day10loops;

import java.util.Scanner;

public class Review_DoWhileLoop01 {

    public static void main(String[] args) {

         /*  Example 1: Ask user to enter an integer.
              If the integer is less than 100, tell user "Won!"
              Otherwise, tell user "Lost!"
         */

        Scanner input = new Scanner(System.in);

        int num = 0 ;

        do {
            System.out.println("Enter a number to play!");
            num = input.nextInt();

            if (num < 100) {
                System.out.println("You won!");
            }
        } while (num < 100) ;
            System.out.println("You lost!");


        }
}

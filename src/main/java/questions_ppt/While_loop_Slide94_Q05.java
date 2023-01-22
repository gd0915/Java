package questions_ppt;

import java.util.Scanner;

public class While_loop_Slide94_Q05 {

    public static void main(String[] args) {

        /*
            Type java code by using while loop,
            Write a program to count the factors of an integer which is entered by user.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to count its factors");
        int num = input.nextInt();

        int i = 1;

        while(i<=num) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }





    }
}

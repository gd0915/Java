package questions_ppt;

import java.util.Scanner;

public class While_Loop_Slide94__Q04 {

    public static void main(String[] args) {

         /*
        Type java code by using while loop,
        Write a program that prompts the user to input a positive integer.
        It should then print factorial of that number.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer ");
        int i = input.nextInt();

        int k = 1;
        int fact = 1;

        while(k<=i) {
            fact = fact*k;
            k++;
        }
        System.out.println( "Factorial of " + i + " is: " + fact);








    }




}

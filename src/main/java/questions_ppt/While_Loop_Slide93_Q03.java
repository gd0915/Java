package questions_ppt;

import java.util.Scanner;

public class While_Loop_Slide93_Q03 {

    public static void main(String[] args) {

        /*
        Type java code by using while loop,
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer to print its multiplication table");
        int i= input.nextInt();

        int k=1;
        while(k<11){
            System.out.println(i + "x" + k + " = " + i*k);
            k++;
        }

    }
}

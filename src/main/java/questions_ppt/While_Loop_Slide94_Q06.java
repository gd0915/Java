package questions_ppt;

import java.util.Scanner;

public class While_Loop_Slide94_Q06 {

    public static void main(String[] args) {

        /*
                Type java code by using while loop,
                Write a program that prompts the user to input an integer.
                It should then find sum of the digits of that number.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer to find the sum of its digits");
        int n = input.nextInt();
        String s = String.valueOf(n);
        int sum =0;


        int i = 0;

        while(i<s.length()){
            String digit = s.substring(i, i+1);
            sum = sum + Integer.valueOf(digit);
            i++;
        }
        System.out.println(sum);








    }
}

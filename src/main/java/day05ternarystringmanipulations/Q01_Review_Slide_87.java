package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q01_Review_Slide_87 {

   /*
   Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
If it is greater than 10 multiply it by 2 and print it on the console. Otherwise, keep the number same
and print it on the console.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer , please!");
        int num1 = input.nextInt();

        int result = num1<10 ? (num1*num1) : (num1*2);
        System.out.println(result);

    }
}

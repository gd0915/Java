package questions_02;

import java.util.Random;
import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {

        //Ask user to enter a positive integer and then find and print  the sum of the digits of that number by using while loop.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive Integer please!");
        int number = input.nextInt();

        int sumOfDigits = 0;

        while(number>0){

            sumOfDigits = sumOfDigits + number%10;
            number = number/10;
        }
        System.out.println("The sum of the digits is " + sumOfDigits);


    }
}

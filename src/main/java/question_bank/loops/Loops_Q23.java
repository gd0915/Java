package question_bank.loops;

import java.util.Scanner;

public class Loops_Q23 {

    public static void main(String[] args) {

        /*
        Ask the user to enter an integer to check if it is a prime number or not. Example: if user
        enters 43 output will be “43 is a prime number”, if user enters 120 output will be “120 is not a
        prime number”, if user enters negative integers output will be “Enter a positive integer”
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer please!");
        int number = input.nextInt();

        int count = 0;
        if(number>0) {
            if (number == 1) {
                System.out.println(number + " is prime number");
            }else {
                for(int i=2; i<number; i++) {
                    if(number%i==0) {
                        count++;
                    }
                }
                if(count==0) {
                    System.out.println(number + " is prime");
                }else {
                    System.out.println(number + " is not prime");
                }
            }
        }else {
            System.out.println("Enter a positive integer");
        }



















    }
}

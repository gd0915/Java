package questions;

import java.util.Scanner;

public class Q58 {

    public static void main(String[] args) {

        // Write a code to if the given number is prime or not when the user enter an integer
        // print the factors and number of the factors of the entered number


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = input.nextInt();

        int count = 0;
        String factors = "";

        if (number > 0) {
            for (int i = 1; i <= number ; i++) {
                if (number % i == 0) {
                    factors = factors + i + " ";
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number + " is a prime number");
                System.out.println("Factors of " + number + " are " + factors);
                System.out.println("There are " + count + " factors of " + number);
            } else {
                System.out.println(number + " is a not a prime number");
                System.out.println("Factors of " + number + " are " + factors);
                System.out.println("There are " + count + " factors of " + number);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
    }
}

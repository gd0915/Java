package questions;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {


        //Ask the user to enter an integer to check if it is a prime number or not.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer please!");
        int number = input.nextInt();

        primeNumber(number);


    }

        public static void primeNumber(int number) {
            int counter = 0;

            if (number > 0) {
                if (number == 1) {
                    System.out.println("This number is not a prime number");
                } else {
                    for (int i = 2; i < number; i++) {
                        if (number % i == 0) {
                            counter++;
                        }
                    }
                    if (counter == 0) {
                        System.out.println(number + " is a prime number");
                    } else {
                        System.out.println(number + " is not a prime number");
                    }
                }
            } else {
                System.out.println("Enter a positive integer please!");
            }


        }

}
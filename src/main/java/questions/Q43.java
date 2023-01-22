package questions;

import java.util.Scanner;

public class Q43 {

    /*
    Write a program that accepts an integer as input and prints all prime numbers less than input (excluding  input)
    Check numbers if they are even or not in a return method.


     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

      allPrimeLessThanNumber(20);


    }


    public static void allPrimeLessThanNumber(int number) {
        System.out.println("Enter a number  to see all the prime numbers less than that number");
        number = scan.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive number please!");

        } else {
            int counter = 0;

            for (int i = 2; i < number; i++) {

                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        counter++;
                    }
                }
                if (counter == 2) {
                    System.out.print(i + " ");
                }
                counter = 0;
            }
        }
    }

}

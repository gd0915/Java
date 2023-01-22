package selfpractices.selfpractice_loops;

import java.util.Scanner;

public class PrintPrimeNumbers {

    public static void main(String[] args) {

        //Question 28-  Type a code that prints all prime numbers less than a given number. Example: if user enters
        //20 output will be 2, 3, 5, 7, 11, 13, 17, 19


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int n = scan.nextInt();


        int counter = 0;


        for (int i = 2; i < n; i++) {

            for (int k = 1; k <= i; k++) {

                if (i % k == 0) {
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

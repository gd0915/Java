package selfpractices.selfpractice_arrays;

import java.util.Scanner;

public class Arrays_04 {

    public static void main(String[] args) {

        // Example 01: Create an array whose length is 4 and print the second element on the console.
        int arr[] = {12, 23, 36, 19};
        int sizeOfArr = arr.length;
        System.out.println(sizeOfArr);//4

        //Example 2: Type a code to print all elements in reverse order by putting "*" before each of them on the same line

        int brr[] = {12, 23, 36, 19, 86, 56};

        for (int i = brr.length - 1; i >= 0; i--) {
            System.out.print("*" + brr[i]);//*56*86*19*36*23*12
        }

        System.out.println("===================");

        //Example 03: Type code to print the elements whose indexes are even numbers.
        int crr[] = {12, 23, 36, 19, 86, 56, 96, 87};

        for (int i = 0; i < crr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(crr[i] + " ");//12 36 86 96
            }
        }

        System.out.println("==================");

        //Example 04:  Ask user to create an integer array and type all odd numbers on the console.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of element to create an Array");
        int numOfElements = input.nextInt();

        int drr[] = new int[numOfElements];

        for (int i = 0; i < numOfElements; i++) {
            System.out.println("Enter the " + (i + 1) + ". element please");
            drr[i] = input.nextInt();
        }

        for (int w : drr) {
            if (w % 2 == 1) {
                System.out.print(w + " ");
            }

        }












    }
}

package day01variables;

import java.util.Scanner;

public class Swap_ByUsingThirdVariable_Example02_Slide54 {
    /*
        Ask user to enter two integer values. Write a Java Program to swap
        two numbers by using the third variable.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap, please!");
        int n1 =input.nextInt();
        int n2 =input.nextInt();
        System.out.println("Before swapping: " + n1 + "-" + n2);

        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping :" + n1 + "-" +n2);
    }
}

package questions;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {

        //Ask user to enter 2 numbers, and write a Java Program to swap two numbers

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number please!");
        double num1 = input.nextDouble();
        System.out.println("Enter the second number please!");
        double num2 = input.nextDouble();

        System.out.println("Before swapping num1 is: " + num1 + " " + "num2 is: " + num2);

        //1.Way: By using third variable
//        double temp= 0;
//        temp = num1;
//        num1 = num2;
//        num2 = temp;
//
//        System.out.println("After swapping num1 is: " + num1 + " num2 is: " + num2);

        System.out.println();

        //2.Way: Without using third variable

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swapping num1 is: " + num1 + " num2 is: " + num2);




    }
}

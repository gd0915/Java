package day01variables;

import java.util.Scanner;

public class Modulus_Example01_Slide54 {

    /*
        Type a program like;
    Ask user to enter two integer values, the first will be greater than the second.
    The remainder when you divide the first by the second will be the width,
    and the sum of the two numbers will be the length of a rectangle.
    Then calculate the area and the perimeter of the rectangle, and print them
    on the console.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers, please!");
        int num1 =input.nextInt();
        int num2 =input.nextInt();

        double width = num1/num2, length = num1+num2;
        System.out.println("The area of the rectangle is " + width*length);
        System.out.println("The perimeter of the rectangle is " + ((2*width) + (2*length)));












    }
}

package questions_ppt;

import java.util.Scanner;

public class Slide_37_Example01 {

    /*

        Type a program which calculates the area and the perimeter of a square
        whose side length is entered by user.
        Hint 1: Area of a square is length x length
        Hint 2: Perimeter of a square is 4x length

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length, please");
        double length = input.nextDouble();

        System.out.println("The area of the square is " + (length*length));
        System.out.println("The perimeter of the square is " + (4*length));


    }
}

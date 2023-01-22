package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q04_TernaryOperatorQuestions_Slide_76 {
    /*
        Type java code by using  ternary.
        Take values of length and width of a rectangle from user and check if it is square or not.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length and width, please!");
        double length = input.nextDouble();
        double width = input.nextDouble();

        String rectangle = length!=width ? ("It is a rectangle") : ("It is a square");
        System.out.println(rectangle);


    }
}

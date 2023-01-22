package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q03_TernaryOperatorQuestions_Slide_76 {
    /*
        Type java code by using ternary.
        Write a program to print absolute value of an integer entered by user.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer, please!");
        int abs = input.nextInt();

        int absValue = abs>=0 ? (abs) : (-1*abs);
        System.out.println(absValue);

    }
}

package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q07_TernaryOperatorQuestions_Slide_76 {

    /*
        Ask user to enter a number. If the number is less than 10 and greater
        than or equal to 0, calculate its cube. Otherwise, calculate its square.
        Cube of a = a*a*a Square of a = a*a
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number, please");
        double num1 = input.nextDouble();

        double result = num1<10 && num1>=0 ? (num1*num1*num1) : (num1*num1);
        System.out.println(result);







    }
}

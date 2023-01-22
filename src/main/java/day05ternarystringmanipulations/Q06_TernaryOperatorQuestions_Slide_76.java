package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q06_TernaryOperatorQuestions_Slide_76 {
    /*
            Ask user to enter an integer.
         If the number has 3 digits, output will be “This number has 3 digits.”
         Otherwise, output will be “This number has no 3 digits.”
         How can you decide the number of digits of an integer?
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer, please");
        int numDigit = input.nextInt();

        String s1 =String.valueOf(numDigit);

        String digit = s1.length()==3 ? ("This number has 3 digits") : ("This number has no 3 digits");
        System.out.println(digit);


    }
}

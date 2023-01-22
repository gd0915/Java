package day04nestedifswitch;

import java.util.Scanner;

public class Q01_NestedIfStatement_Homework_PPT {

    /*
    Type java code by using nested if statement,
    If a number is even then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
    “Perfect even number” otherwise, the output will be “Good even number.”
    If the number is odd then check if it is divisible by 3 or not. If it is divisible by 3 the output will be
    “Perfect odd number” otherwise, the output will be “Good odd number.”
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number, please!");
        int num1 = input.nextInt();

        if(num1%2==0) {
            if (num1 % 3 == 0) {
                System.out.println("Perfect even number");
            } else {
                System.out.println("Good even number");
            }
        }else if(num1%2 != 0) {
            if (num1 % 3 == 0) {
                System.out.println("Perfect odd number");
            } else {
                System.out.println("Good even number");
            }
        }else {
            System.out.println("Invalid number");
        }



    }
}

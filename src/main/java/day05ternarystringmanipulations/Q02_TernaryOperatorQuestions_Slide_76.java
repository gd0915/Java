package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q02_TernaryOperatorQuestions_Slide_76 {
    /*
    Type java code by using ternary and if-else. Ask user to enter two integers
Write a program to print the minimum one on the console.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two Integers, please!");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

//        if(num1>num2){
//            System.out.println("The minimum value is " +num2);
//        }else if(num1<num2){
//            System.out.println("The minimum value is " + num1);
//        }else{
//            System.out.println();
//        }


        Object min = num1>num2 ? ("The minimum value is " +num2) : ("The minimum value is " +num1);
        System.out.println(min);










    }
}

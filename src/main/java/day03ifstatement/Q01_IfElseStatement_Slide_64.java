package day03ifstatement;

import java.util.Scanner;

public class Q01_IfElseStatement_Slide_64 {

    /*

    Ask user ta enter a 4 digits integer, then print the sum of the first
    and the last digit of the number on console.
    For example; if user enters 1234 you will add 1 and 4,
    then print on the console 5
     */

    public static void main(String[] args) {

    //1.Way:
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a four digits number, please");
//        int num1 = input.nextInt();
//        System.out.println("Enter the first digit of the number, please!");
//        int firstDigit = input.nextInt();
//        System.out.println("Enter the last digit of the number, please!");
//        int lastDigit = input.nextInt();
//
//
//        if(num1>=1000){
//            System.out.println(firstDigit + lastDigit);
//        }else{
//            System.out.println("Sorry, no operation allowed!");
//        }

    //2.Way:

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a 4 digits number please");
        int num=scan.nextInt();
        int fDigit=num/1000;
        int lDigit=num%10;
        System.out.println("The sum of first and last digits of numbers: "+(fDigit+ lDigit));





    }
}
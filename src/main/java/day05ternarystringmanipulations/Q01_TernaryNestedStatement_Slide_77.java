package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q01_TernaryNestedStatement_Slide_77 {

    /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year, please!");
        int year = input.nextInt();


        String leap = year%100==0 ? (year%400==0 ? "It's a leap year" : "It's not a leap year") : (year%4==0 ? "It's a leap year" : "It's not a leap year");
        System.out.println(leap);


    }




}

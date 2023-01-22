package day04nestedifswitch;

import java.util.Scanner;

public class Q02_NestedIfStatement_Homework_PPT {

    /*
        Type java code by using nested if() statement.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year,please!");
        int year = input.nextInt();

        if(year%100 == 0) {
            if (year % 400 == 0) {
                System.out.println("It's a leap year");
            } else {
                System.out.println("It's not a leap year!");
            }
        }else if(year%100 != 0){
            if(year%4 == 0){
                System.out.println("It's a leap year");
            } else {
                System.out.println("It's not a leap year");
            }
        }
    }
}

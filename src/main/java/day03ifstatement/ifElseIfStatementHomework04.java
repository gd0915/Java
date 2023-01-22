package day03ifstatement;

import java.util.Scanner;

public class ifElseIfStatementHomework04 {
    /*
        Ask user to enter year
        Type java code by using if-else if() statement.
        Write a program to check if a year is leap year or not.
        if the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year,please!");
        int year = input.nextInt();

        if(year%4==0){
            System.out.println("It's a leap year");
        }else if(year%4!=0){
            System.out.println("it's not a leap year");
        }else{
            System.out.println("Please, enter a valid year");
        }


    }
}

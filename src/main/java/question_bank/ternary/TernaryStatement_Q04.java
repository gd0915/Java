package question_bank.ternary;

public class TernaryStatement_Q04 {

     /*Type Apex code by using nested ternary.
    Write a program to check if a year is a leap year or not.
    If the year is divisible by 100 then it must be divisible by 400.
    If a year is not divisible by 100 then it must be divisible by 4
         */

    public static void main(String[] args) {

            int year = 1996;

            String isLeap = (year==100) ? (year%400==0 ? "It's a leap year" : "It's not a leap year") : (year%4==0 ? "It's a leap year" : "It's not a leap year");

             System.out.println(isLeap);









    }





}

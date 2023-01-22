package questions;

import java.util.Scanner;

public class Q39 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Create a  method to check whether a year (integer) entered by the user is a leap year or not.

        isLeapYear(1996);

    }

    public static void isLeapYear(int year){

        System.out.println("Enter a year to check if it is leap year");
        year = input.nextInt();

        String isLeap = year%100==0 ? year%400==0 ? "It's a leap year" : "It is not a leap year" : year%4== 0 ? "It is a leap year" : "It is not a leap year";
        System.out.println(isLeap);

    }




}

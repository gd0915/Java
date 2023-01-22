package day04nestedifswitch;

import java.util.Scanner;

public class Q05_SwitchStatement_Homework_Q_Bank {

    /*
        Type a code to display the number of days in a given month of a given year.
        Example: The number of days in February 2000 was 29
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number, please");
        int month = input.nextInt();
        System.out.println("Enter the year, please!");
        int year = input.nextInt();

        int numDays = 0;

        switch (month) {

            case 1: case 3: case 5:
            case 7: case 8:case 10:
            case 12:
                System.out.println(31);
                break;
            case 4: case 6:
            case 9: case 11:
                System.out.println(30);
                break;
            case 2:
                if((year%4==0) && !(year%100==0) || (year%400==0)) {
                    numDays = 29;
                }else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
        System.out.println("Number of Days = " + numDays);
    }
}
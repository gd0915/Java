package day03ifstatement;

import java.util.Scanner;

public class ifStatementHomework02 {

    public static void main(String[] args) {

        /*
        Type java code by using if statement. When you enter the initial of the day of a week,
        output should be all possible names of the days.
        For example; if the initial is ’S’ output should be “Saturday or Sunday
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the initial of the day, please!");
        String initialOfTheDay = input.nextLine();

        if(initialOfTheDay.equalsIgnoreCase("M")){
            System.out.println("Monday");
        }
        if(initialOfTheDay.equalsIgnoreCase("T")){
            System.out.println("Tuesday " + " " + "Thursday");
        }
        if(initialOfTheDay.equalsIgnoreCase("W")){
            System.out.println("Wednesday");
        }
        if(initialOfTheDay.equalsIgnoreCase("F")){
            System.out.println("Friday");
        }
        if(initialOfTheDay.equalsIgnoreCase("S")){
            System.out.println("Saturday " + "Sunday ");
        }
    }
}

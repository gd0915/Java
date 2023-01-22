package day03ifstatement;

import java.util.Scanner;

public class ifStatementHomework03 {

    public static void main(String[] args) {

        /*
        Type java code by using if statement. When you enter the name of the day of a week,
        output will be “Weekday” or “Weekend day” according to the name of the day.
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the day, please!");
        String nameOfTheDay = input.nextLine();

        if (nameOfTheDay.equalsIgnoreCase("Monday")) {
            System.out.println("Weekday");
        }
        if (nameOfTheDay.equalsIgnoreCase("Tuesday")) {
            System.out.println("Weekday");
        }
        if (nameOfTheDay.equalsIgnoreCase("Wednesday")) {
            System.out.println("Weekday");
        }
        if (nameOfTheDay.equalsIgnoreCase("Thursday")) {
            System.out.println("Weekday");
        }
        if (nameOfTheDay.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");
        }
        if (nameOfTheDay.equalsIgnoreCase("Saturday")) {
            System.out.println("Weekend Day");
        }
        if (nameOfTheDay.equalsIgnoreCase("Sunday")) {
            System.out.println("Weekend Day");
        }
    }
}
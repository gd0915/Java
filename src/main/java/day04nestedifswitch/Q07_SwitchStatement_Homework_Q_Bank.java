package day04nestedifswitch;

import java.util.Scanner;

public class Q07_SwitchStatement_Homework_Q_Bank {

    /*
    Use switch statement to create a converter which converts mile to km, second to hour,
    fahrenheit to celsius. Find the formulas for conversions from Google.
    a) When user entered 10 and mileToKm String, your code should print "16 km" (The number
    will be dynamic) on the console
    b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The
    number will be dynamic) on the console
    c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333
    celsius"(The number will be dynamic) on the console
    d) When user entered operation different from mileToKm, secondsToHours,
    fahrenheitTo-Celsius your code should print "That operation was not defined for that converter"
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mile");
        double mile = input.nextDouble();

        System.out.println("Enter the second");
        double second = input.nextDouble();

        System.out.println("Enter the fahrenheit");
        double fahrenheit = input.nextDouble();

        System.out.println("Enter an operation among mileToKm, secondsToHours, fahrenheitToCelsius ");
        String operator = input.nextLine();


        switch(operator) {

            case "mileToKm":
                System.out.println(mile * 1.60934);
                break;

            case "secondsToHours":
                System.out.println((second / 60) / 60);
                break;

            case "fahrenheitToCelsius":
                System.out.println((fahrenheit - 32) * 5 / 9);
                break;
            default:
                System.out.println("That operation was not defined for that converter");
        }

        }

    }


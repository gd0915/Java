package day03ifstatement;

import java.util.Scanner;

public class ifElseStatementHomework07 {

    public static void main(String[] args) {

        /*
            Type java code by using if-else statement.
            A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
            Ask user for quantity and unit price then judge and print total cost for user.
            If the quantity is less than 1000 output will be “No discount.”
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the quantity and the unit price, please!");
        int quantity =input.nextInt();
        double price = input.nextDouble();

        if(quantity * price >= 1000){
            System.out.println("10% off ");
        }else if(quantity * price < 1000){
            System.out.println("No discount");
        }else{
            System.out.println("invalid data");
        }


    }
}

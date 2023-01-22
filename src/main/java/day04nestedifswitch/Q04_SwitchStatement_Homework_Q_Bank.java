package day04nestedifswitch;

import java.util.Scanner;

public class Q04_SwitchStatement_Homework_Q_Bank {
/*
    Print "Boy" if the gender is "Male" (Ignore cases)
    Print "Girl" if the gender is "Female" (Ignore cases)
    Print "Others" if the gender is different from "Male" and "Female"
     */


    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender, please!");
        String gender = input.nextLine().toLowerCase();

        switch(gender){

            case "male":
                System.out.println("Boy");
            break;

            case "female":
                System.out.println("Girl");
            break;

            default:
                System.out.println("Others");
        }
    }
}

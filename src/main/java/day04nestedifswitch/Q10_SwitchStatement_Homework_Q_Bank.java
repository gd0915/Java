package day04nestedifswitch;

import java.util.Scanner;

public class Q10_SwitchStatement_Homework_Q_Bank {

    /*
    Create a method which gives you a random alphabetical character in myClass Class then
    print the following by using the method.
    Print "First Character" for 'A' and 'a'
    Print "Second Character" for 'B' and 'b'
    Print "Third Character" for 'C' and 'c'
    Print "Forth Character" for 'D' and 'd'
    Print "Other Characters" for all others
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an alphabetical character");
        String alphabet = input.next().toLowerCase();

        switch(alphabet){
            case "a":
                System.out.println("First Character");
                break;
            case "b":
                System.out.println("Second Character");
                break;
            case "c":
                System.out.println("Third Character");
                break;
            case "d":
                System.out.println("Fourth Character");
                break;
            default:
                System.out.println("Other Characters");

        }
    }
}

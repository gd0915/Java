package day04nestedifswitch;

import java.util.Scanner;

public class Q04_SwitchStatement_Q04_Slide_82 {

    /*
    Ask user to enter one of the ‘U’, ’S’, and ‘A’.
    Then type a program by using “switch statement” to print “United” for ‘U’
     ”States”  for 'S', and “America” for ‘A’
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character among U, S, A, please!");
        char character = input.next().toUpperCase().charAt(0);

        switch(character){

            case 'U':
                System.out.println("United");
                break;
            case 'S':
                System.out.println("States");
                break;
            case 'A':
                System.out.println("America");
                break;
            default:
                System.out.println("Invalid marks");
        }
    }
}

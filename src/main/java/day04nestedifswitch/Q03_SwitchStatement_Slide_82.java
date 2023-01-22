package day04nestedifswitch;

import java.util.Scanner;

public class Q03_SwitchStatement_Slide_82 {

    /*
    Type java code by using switch statement.
    A school has the following rules for grading system:
    1. For 50 - C 2. For 80 - B. 4. For 100 - A
    Ask user to enter marks and print the corresponding grade.
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your mark, please!");
        int mark = input.nextInt();

        switch(mark){

            case 50:
                System.out.println("C");
                break;
            case 80:
                System.out.println("B");
                break;
            case 100:
                System.out.println("A");
                break;
            default:
                System.out.println("Invalid marks");
        }

    }
}
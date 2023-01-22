package day04nestedifswitch;

import java.util.Scanner;

public class Q02_SwitchStatement_Slide_82 {

    /*
        Write a Java program user will choose answer among A, B, C, or D.
    If the answer is true, output will be “True.” If the answer is false, output will be
    “False”. Correct answer is ‘C’ for the multiple option question.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your answer among A, B, C, D, please");
        String answer = input.next().toLowerCase();

        switch(answer){
            case "a":
            case "b":
            case "d":
                System.out.println("False");
                break;
            case "c":
                System.out.println("True");
                break;
            default:
                System.out.println("Invalid Answer");

        }
    }
}

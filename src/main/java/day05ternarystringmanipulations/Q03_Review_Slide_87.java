package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q03_Review_Slide_87 {
    /*
        Ask user to enter a letter, if it is uppercase check it is before “F” or not in alphabetical order.
    If it is before “F” in alphabetical order output will be “ Big before F”, otherwise output will be
    “Big after F.”
    If it is lowercase check it is before “h” or not in alphabetical order.
    If it is before “h” in alphabetical order output will be “Small before h”, otherwise “Small after h”
     */

    public static void main(String[] args) {


       // 1. Way


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the letter please");
        char l = input.next().charAt(0);

        if (l >= 'A' && l <= 'Z') {
            if (l >= 'A' && l < 'F') {
                System.out.println("Big before F");
            } else {
                System.out.println("Big after F");
            }
        } else if (l >= 'a' && l <= 'z') {
            if (l >= 'a' && l < 'h') {
                System.out.println("Small before h");
            } else {
                System.out.println("Small after h");
            }

        } else {
            System.out.println("Please enter a letter");
        }











    }




}

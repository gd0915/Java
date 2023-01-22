package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q05_TernaryOperatorQuestions_Slide_76 {
    /*
        Ask user to enter a String. If the String has 2 characters, output will be
        “It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String, please");
        String numCharacter = input.nextLine();

        String isValid = numCharacter.length()==2 ? ("It is valid for state abbreviations") : ("It is not valid for state abbreviations");
        System.out.println(isValid);





    }



}

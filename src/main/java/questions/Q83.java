package questions;

import java.util.Scanner;

public class Q83 {

    /*
         * Ask user to enter a String (sentence) and a character
         * Type code to find the frequency of the character in the given String

         * INPUT : Sentence: I like to learn Java! Letter : e
         * OUTPUT : The letter "e" is used 2 times in the sentence
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence please ");
        String str = scan.nextLine().toLowerCase();
        System.out.println("Enter a character to check how many times does it occur in that entered sentence!");
        String letter = scan.next().toLowerCase();

        int counter= 0;
        for(int i=0; i<str.length();i++){
            String ch = str.substring(i, i+1);
            if(ch.equals(letter)){
                counter++;
            }
        }
        System.out.println("The letter " + letter + " is used " + counter + " times in the sentence");


    }
}

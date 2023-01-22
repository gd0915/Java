package day05ternarystringmanipulations;

import java.util.Scanner;

public class Q5_Review_Slide_88 {
    /*
    Ask user to enter a word which has 4 letters and output will be inverse of the word.
    For example; if user enters “MARK” output will be “KRAM”
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4 letters word, please!");
        String word = input.nextLine();

//        String first = word.substring(0,1);
//        String second = word.substring(1,2);
//        String third = word.substring(2,3);
//        String last = word.substring(word.length()-1);



       System.out.println( word.charAt(3) + "" + word.charAt(2) + "" +     //1.way
                word.charAt(1) + "" +  word.charAt(0) );

        System.out.println( word.substring(3,4) + word.substring(2,3) +
                word.substring(1,2) + word.substring(0,1) );



    }
}

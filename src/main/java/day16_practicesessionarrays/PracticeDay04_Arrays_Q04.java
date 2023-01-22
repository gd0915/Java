package day16_practicesessionarrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeDay04_Arrays_Q04 {

    public static void main(String[] args) {

        //Example 1: Get string from user and type code to find the number of words in the String
        //String strArr [] = {"Learn Java earn money"};

        Scanner  input = new Scanner(System.in);
        System.out.println("Enter a sentence to check the number of the words");
        String str = input.nextLine();

        String strArr [] = str.split(" ");
        System.out.println(Arrays.toString(strArr));

        System.out.println("The total number of words are: " + strArr.length);




    }
}

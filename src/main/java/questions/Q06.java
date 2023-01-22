package questions;

import java.util.Scanner;

public class Q06 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Create a program checks if a String is palindrome or not.
	 	If a word, phrase, or sequence that reads the same backward as forward, then it is called "Palindrome",
	    For example, "madam" or "nurses run".
         */
        System.out.println("Enter a String to check if it is a palindrome or not!");
        String str = input.nextLine().toLowerCase();
        str = str.replaceAll("\\s", "");
        System.out.println(str);

        palindrome(str);

    }

    public static void palindrome(String str) {

        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        //System.out.println(reverse);

        if(str.equals(reverse)){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }


    }

}

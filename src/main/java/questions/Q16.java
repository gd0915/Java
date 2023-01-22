package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {

       /*
	  Ask user to enter 2 Strings.
	  If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
	  Otherwise, print "Not Anagram" on the console.
	  Ignore cases.
	  For example; "Mary" and "army" and "RAMY" are Anagrams.
	*/

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter 2 Strings please!");
            String str1 = scan.nextLine();
            String str2 = scan.nextLine();

            String arr [] = str1.toLowerCase().split("");
            String brr [] = str2.toLowerCase().split("");

            Arrays.sort(arr);
            Arrays.sort(brr);

            if(str1.isEmpty()  || str2.isEmpty()){
                System.out.println("It is not anagram");
            }else if(arr.length ==brr.length && Arrays.equals(arr, brr)){
                     System.out.println("It is anagram");
            }else{
                System.out.println("Not anagram");
            }



    }
}

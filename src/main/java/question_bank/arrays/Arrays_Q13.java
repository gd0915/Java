package question_bank.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Q13 {
    /*
            Ask the user to enter 2 Strings.
            If the characters and the numbers of characters of the Strings are the same,
            then print "Anagram" on the console.
            Otherwise, print "Not Anagram" on the console.
            Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two Strings please!");
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        String arr [] = s1.toLowerCase().split(" ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String brr [] = s2.toLowerCase().split(" ");
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
        }else if(s1.isEmpty() || s2.isEmpty()){
            System.out.println("Not Anagram");
        }else if(Arrays.equals(arr, brr)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
        /*
        Enter two Strings please!
        anna
        Anna
        [anna]
        [anna]
        Anagram
         */



















    }
}

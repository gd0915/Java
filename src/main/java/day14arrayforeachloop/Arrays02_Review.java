package day14arrayforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02_Review {

    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print the date like "Month:09    Day:20     Year:2022"

        String date = "09/20/2022";
        String arr [] = date.split("/");
        System.out.println(Arrays.toString(arr));//[09, 20, 2022]

        System.out.println("Month:" + arr[0] + " Day:" + arr[1] +" Year:" + arr[2]);//Month:09 Day:20 Year:2022

        System.out.println("============");

        //Example 2: Get string from user and type code to find the number of words in a String.

        String str = "I like to move it, move it!";
        String brr [] = str.split(" ");
        int length = brr.length;
        System.out.println("The number of the words is " + brr.length);//7

        System.out.println("==================");

        //Example 3: Find the number of the total characters in a given String
                    // String str = "I like to move it, move it!";

        String crr [] = str.split(" ");
        System.out.println(Arrays.toString(crr));//[I, like, to, move, it,, move, it!]

        int sum = 0;

        for(String w : crr){
            sum = sum + w.length();
        }
        System.out.println(sum);//21


        System.out.println("=================");

        //Example 4: Count the number of words starts with "a" in the String

        String str1  = " I like to move it, move it";
        String drr [] = str1.split(" ");
        System.out.println(Arrays.toString(drr));//[, I, like, to, move, it,, move, it]

        int counter = 0;

        for(String w : drr){

            if(w.startsWith("a")){
                counter++;

            }
        }
        System.out.println(counter);//0

        System.out.println("==================");

        //Example 5: Type code to find the longest word in the sentence

        String str2 = "I want to go to university to learn more";

        String srr [] = str2.split(" ");
        Arrays.sort(srr);
        System.out.println(Arrays.toString(srr));//[I, go, learn, more, to, to, to, university, want]

        Arrays.sort(srr, Comparator.comparingInt(String::length));//ascending order in String
        System.out.println(Arrays.toString(srr));//[I, go, to, to, to, more, want, learn, university]
        System.out.println(srr[srr.length-1]);//university






    }
}

package day14arrayforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print the date like "Month:09    Day:20     Year:2022"

        String date = "09/20/2022";

        String dateArray[] = date.split("/");

        System.out.println(Arrays.toString(dateArray));//[09, 20, 2022]

        System.out.println("Month: " + dateArray[0] + " Day: " + dateArray[1] +" Year: " + dateArray[2]);
//        System.out.println("Day " + dateArray[1]);
//        System.out.println("Year " + dateArray[2]);


        System.out.println("==============");

        //Example 2: Get string from user and type code to find the number of words in a String.

        String str  = " I like to move it, move it";//space at the beginning
        String arr [] = str.split(" ");
        System.out.println(Arrays.toString(arr));

        System.out.println("The number of the words is " + arr.length);//8


        //Number of the total characters
        int sum = 0;

        for(String w : arr){
            sum = sum + w.length();
        }
        System.out.println(sum);

        System.out.println("==============");

        //Example 3: Count the number of words starts with "a" in the String

        String str1  = " I like to move it, move it";
        String arr1 [] = str.split(" ");

        int counter = 0;//This is called "flag"

        for(String w : arr1){

            if(w.startsWith("a")){
                counter++;
            }
        }
        System.out.println(counter );//0

        System.out.println("===============");

        //Example 4: Type code to find the longest element

        String str2 = "I want to go to university to learn more";

        String words [] = str2.split(" ");
        System.out.println(Arrays.toString(words));//[I, want, to, go, to, university, to, learn, more]

        Arrays.sort(words, Comparator.comparingInt(String::length));//ascending order
                                                                    //(String::length) means go to String class use the length method
        // First parameter is the name of the Array
        // Second parameter look at the length of the element and compare them

        System.out.println(Arrays.toString(words));//[I, to, go, to, to, want, more, learn, university]

        System.out.println(words[words.length-1]);//university














    }
}

package selfpractices.selfpractice_mixedtopics;

import java.util.Arrays;

public class Arrays_Split_NumOfChars {
    public static void main(String[] args) {


        String s = "Java, I like Java?";

        //1.Way
        String arr[] = s.split("a");
        System.out.println(Arrays.toString(arr));//[J, v, , I like J, v, ?]

        System.out.println("The number of the characters in the Array is " + (arr.length-1));//4



    }
}
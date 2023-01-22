package question_bank.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays_Q03 {

    public static void main(String[] args) {

        /*
            Find the elements whose length is the smallest in a String array
            Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
         */

        String a [] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli", "Can"};

        //1.Way:

        int minLength = a[0].length();

        for(String w : a){
            minLength = Math.min(minLength, w.length());
        }
        for(String w : a) {
            if (minLength == w.length()) {
                System.out.println(w);
            }
        }

        //2.Way
        Arrays.sort(a, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(a));//[Can, Mark, Veli, Kemal, Angie, Jonathan]

        String str="";

        for(String w : a){
            if(a[0].length() == w.length()){
                str = w;
            }
        }
        System.out.println("The smallest elements are " + str);







    }
}

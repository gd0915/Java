package questions_02;

import java.util.Arrays;

public class Q07 {

    public static void main(String[] args) {

        //Find the number of vowels in a String

        String str = "I like to move it move it";

        //1.Way:
        int  numOfVowels = str.toLowerCase().replaceAll("[^aeiou]", "").length();
        System.out.println(numOfVowels);//10

        //2.Way:
        String arr [] = str.toLowerCase().split("");
        System.out.println(Arrays.toString(arr));//[i,  , l, i, k, e,  , t, o,  , m, o, v, e,  , i, t,  , m, o, v, e,  , i, t]

        int counter = 0;

        for(String w : arr){

            switch(w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }
        }
        System.out.println(counter);


    }
}

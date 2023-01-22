package question_bank.arrays;

import java.util.Arrays;

public class Arrays_Q09 {

    //Type code to find if a given element exists in a given array or not

    public static void main(String[] args) {


        String str = "I like to move it move it";

        String arr [] = str.toLowerCase().split("");
        System.out.println(Arrays.toString(arr));//[i,  , l, i, k, e,  , t, o,  , m, o, v, e,  , i, t,  , m, o, v, e,  , i, t]

        int counter = 0;
        String element = "a";

        for(String w : arr){
            if(w.equals(element)){
                counter++;
            }
        }
        if(counter>0){
            System.out.println("The character exists in the Array");
        }else{
            System.out.println("Does not exist");
        }


    }
}
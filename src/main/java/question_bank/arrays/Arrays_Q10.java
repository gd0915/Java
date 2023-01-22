package question_bank.arrays;

import java.util.Arrays;

public class Arrays_Q10 {

    //Type code to find sum of the number of characters of array elements

    public static void main(String[] args) {

        String str = "I like to move it move it";

        String arr [] = str.split(" ");
        System.out.println(Arrays.toString(arr));//[I, like, to, move, it, move, it]

        //Number of the elements
        int numOfElements = arr.length;
        System.out.println(numOfElements);//7

        //Number of the total characters
        int sum = 0;
        for(String w : arr){
            sum = sum + w.length();
        }
        System.out.println(sum );//19
    }
}

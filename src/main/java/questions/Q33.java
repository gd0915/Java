package questions;

import java.util.Arrays;

public class Q33 {

    public static void main(String[] args) {

        //Type a code  to find the duplicate values of an array of integer values.

        Integer [] arr = {10, 12, 14, 23, 46, 52, 12, 10, 67};


        for(int i =0; i<arr.length; i++) {
            int counter =0;
            for (int k = i + 1; k < arr.length; k++) {

                if (arr[i] == (arr[k])) {
                    counter++;
                }
            }
            if(counter>0){
                System.out.println("Duplicate element is " + arr[i] + " ");
            }
        }







    }
}

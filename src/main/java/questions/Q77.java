package questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q77 {

     /*
     Ebay Interview Question!!!!

     Put all zeros to end in an integer array
     {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
     {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
    */

    public static void main(String[] args) {

        int arr [] = {0, 0, 1, 2, 0, 3};
        int brr [] = new int[arr.length];
        int idx=0;
        int lastIdx= arr.length-1;

        for(int i= 0; i<arr.length; i++){

            if(arr[i]!=0){
                brr[idx]= arr[i];
                idx++;
            }else{
                brr[lastIdx]= arr[i];
                lastIdx--;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}

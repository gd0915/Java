package day13arrays;

import java.util.Arrays;

public class Arrays04_Review {

    public static void main(String[] args) {

        // Example: [0, 2, 3, 0, 12, 0] put the zeros to the end

       int arr [] = {0, 2, 3, 0, 12, 0};
       int brr [] = new int[arr.length];

       int idx = 0;
       int lastIdx = arr.length-1;

       for(int i = 0; i<arr.length; i++){

           if(arr[i] != 0){

                brr[idx] = arr[i];
                idx++;
           }else{
               brr[lastIdx] = 0;
               lastIdx--;
           }
       }
        System.out.println(Arrays.toString(brr));











    }
}

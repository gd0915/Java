package selfpractices.selfpractice_arrays;

import java.util.Arrays;

public class Arrays_06 {

    public static void main(String[] args) {
        /*
         2) Find the smallest positive element and greatest negative element in an integer array
            //Example:(-12, 18, -5, 23, -2) ==> Smallest positive is 18, the greatest negative is -2
         */

        int arr [] = {-12, 18, -5, 23, -2};
        Arrays.sort(arr);

        for(int i=0; i< arr.length; i++){

            if(arr[i]<0 && arr[i+1]>0){
                System.out.println(arr [i] + " " +  arr[i+1]);
            }
        }







    }
}

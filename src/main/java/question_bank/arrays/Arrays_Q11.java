package question_bank.arrays;

import java.util.Arrays;

public class Arrays_Q11 {
    /*
        Type code to put all zeros to end in an integer array.
        Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
     */

    public static void main(String[] args) {

        int arr [] = {5, 0, 2, 0, 3};

        int brr [] = new int[arr.length];

        int idx = 0;
        int lastIdx = arr.length-1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                brr[idx] = arr[i];
                idx++;
            }else{
                brr[lastIdx]=0;
                lastIdx--;
            }
        }
        System.out.println(Arrays.toString(brr));//[5, 2, 3, 0, 0]













    }
}

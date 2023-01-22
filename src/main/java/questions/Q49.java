package questions;

import java.util.Arrays;

public class Q49 {

    /*  Find the sum of the elements in the array elements of the given multi dimensional array { {1,2,3}, {4,5}, {6,7} } and return an array.
    For example; for { {1,2,3}, {4,5}, {6,7} } output will be {6, 9, 13}
     */

    public static void main(String[] args) {

        int [][] arr = { {1,2,3}, {4,5}, {6,7} };

        int [] crr = new int[arr.length];

        int sum =0;
        int idx =0;

        for(int [] w : arr){

            for(int u : w){
                sum += u;
                crr[idx] = sum;
            }
            idx++;
            sum =0;
        }

        System.out.println(Arrays.toString(crr));


















    }
}

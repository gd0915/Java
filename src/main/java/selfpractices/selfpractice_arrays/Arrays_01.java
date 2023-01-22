package selfpractices.selfpractice_arrays;

import java.util.Arrays;

public class Arrays_01 {

    public static void main(String[] args) {

        //Find the middle element in an integer array
        //       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
        //       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10


        int arr [] = {12, 5, 8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[5, 8, 12]


           if(arr.length/2 != 0){
               int idxOfMidElement = arr.length/2;

           }







    }
}

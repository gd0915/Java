package questions_ppt;

import java.util.Arrays;
import java.util.List;

public class Lists_ForEachLoop_Slide157_Q01 {

    public static void main(String[] args) {

        //Create an integer array find the sum of all elements by using for-each loop and print the sum on the console.

        Integer arr [] = { 21, 36, 56, 88, 20};


        int sum = 0;
        for(int w : arr){
            sum = sum + w;
        }
        System.out.println(sum);//221


//        List<Integer> list = Arrays.asList(arr);
//        System.out.println(list.size());
//        System.out.println(list);
//
//        list.set(1, 15);
//        arr[0] = 10;
//        System.out.println(list);
//        System.out.println(Arrays.toString(arr));

    }
}

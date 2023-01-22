package questions_ppt;

import java.util.Arrays;
import java.util.List;

public class Lists_ForEachLoop_Slide157_Q02 {

    public static void main(String[] args) {

        //Create a list find the sum of all elements by using for-each loop and print the sum on the console.

        List<Integer> myList = Arrays.asList(20, 30, 40, 50, 60);

        int sum = 0;
        for(int w :myList){
            sum = sum +w;
        }
        System.out.println(sum);//200
    }
}

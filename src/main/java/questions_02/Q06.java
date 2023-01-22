package questions_02;

import java.util.Arrays;

public class Q06 {

    public static void main(String[] args) {

        /*
        //Convert arr1 to one dimensional array.    !!!!!
         { {"learn", "java", "it"}, {"is", "easy"} } ==>  { "learn", "java", "it", "is", "easy" }
         */

        String arr1[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        int sum = 0;
        for(String [] w: arr1){
            sum = sum + w.length;
        }
        System.out.println(sum);//5

        String drr[] = new String[sum];

        int idx= 0;
        for(String w [] : arr1){

            for(String u : w){
                drr[idx] = u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(drr));

    }
}

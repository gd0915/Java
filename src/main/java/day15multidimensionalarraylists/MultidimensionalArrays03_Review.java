package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultidimensionalArrays03_Review {

    public static void main(String[] args) {

        //Example 1: Convert multidimensional array to one multidimensional array

        String arr[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        int sum = 0;
        for(String [] w : arr){
            sum = sum + w.length;
        }
        System.out.println(sum);//5

        String brr[] = new String[sum];//We made the code dynamic

        int idx = 0;
        for(String [] w: arr) {
            for (String u : w) {
                brr[idx] = u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));//[learn, java, it, is, easy]










    }
}

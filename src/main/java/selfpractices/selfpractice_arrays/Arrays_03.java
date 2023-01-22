package selfpractices.selfpractice_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays_03 {

    //Find the elements whose length is the smallest in a String array
    //Example: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli

    public static void main(String[] args) {

        String arr [] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
       //1.Way
//        Arrays.sort(arr, Comparator.comparingInt(String::length));
//        System.out.println(Arrays.toString(arr));//[Mark, Veli, Angie, Kemal, Jonathan]
//
//        for(int i =0; i<arr.length; i++){
//            if(arr[0].length() == arr[i].length()){
//                System.out.print( arr[i] + " ");
//            }
//        }
        //2.Way

        int minLength = arr[0].length();
        for(String w: arr){
            minLength=Math.min(minLength, w.length());
        }
        for(String w : arr){
            if(minLength==w.length()){
                System.out.print(w + " ");
            }
        }







    }

}

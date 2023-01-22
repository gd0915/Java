package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q63 {
    /*
        Using array A and array B, return an array that is the intersection of both A and B.
        The intersection includes numbers that appear in both arrays.
        arrayIntersection([1, 3, 5], [1, 5, 7]) → [1, 5]
        arrayIntersection([1], [1, 5, 7]) → [1]
        arrayIntersection([1, 1, 1], [1, 5, 7]) → [1]
        arrayIntersection([], []) → []
            */

    public static void main(String[] args) {

        int arr [] = {1, 3, 5, 5};
        int brr[] = {1, 5, 7};
        List<Integer> intersection = new ArrayList<>();

        for(Integer w : arr){

            for(Integer u : brr){

                if(w==u && !intersection.contains(w)){
                    intersection.add(w);
                }
            }
        }
        System.out.println(intersection);
        System.out.println(Arrays.toString(intersection.toArray()));

    }
}

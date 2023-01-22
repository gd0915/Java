package questions;

import java.util.Arrays;
import java.util.HashSet;

public class Q62 {

    /*
        Given an integer array, return the array with all of the duplicate values removed.
        arrayDeduplication([8, 13, 13, 9, 11, 12]) → [8, 13, 9, 11, 12]
        arrayDeduplication([]) → []
        arrayDeduplication([1, 1, 1]) → [1]
*/
    public static void main(String[] args) {

        int arr [] = {8, 13, 13, 9, 11, 12};

        HashSet<Integer> removedDuplicate = new HashSet<>();

        for(Integer w : arr){

            removedDuplicate.add(w);
        }
        System.out.println(removedDuplicate);
    }
}

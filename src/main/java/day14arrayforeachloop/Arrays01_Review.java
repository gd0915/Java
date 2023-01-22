package day14arrayforeachloop;

import java.util.Arrays;

public class Arrays01_Review {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end

        int arr [] = {0, 2, 3, 0, 12, 0};
        int brr [] = new int[arr.length];

        int idx = 0 ;
        int lastIdx = arr.length-1;

        for(int i = 0; i<arr.length; i++) {

            if (arr[i] != 0) {
                brr[idx] = arr[i];
                idx++;
            } else {
                brr[lastIdx] = 0;
                lastIdx--;
            }
        }
            System.out.println(Arrays.toString(brr));

        System.out.println("=================");

        // Example 2: Type code to check if a specific element exists in an array or not
        //             int crr[] = {-12, 23, 5}; check if 23 exists in the array or not

        int crr[] = {-12, 23, 5};
        Arrays.sort(crr);
        System.out.println(Arrays.toString(crr));//[-12, 5, 23]

        int counter = 0;

        for(int w : crr) {

            if (w == 23) {
                counter++;
            }
        }
            if(counter>0){
                System.out.println("23 exists in this Array");
            }else{
                System.out.println("Does not exist");
            }








    }
}

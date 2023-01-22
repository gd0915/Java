package day14arrayforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end

        int arr [] = {0, 2, 3, 0, 12, 0};
        int brr [] = new int[arr.length];  //dynamic code, if you change arr , brr will be changed automatically

        int idx = 0;
        int lastIdx = arr.length-1;


        for(int i = 0; i<arr.length; i++){

            if(arr[i] != 0){
                brr[idx] = arr[i];
                idx++;
            }else{
                brr[lastIdx] = 0;
                lastIdx--;    //else part does not have to be
            }
        }
        System.out.println(Arrays.toString(brr));

        System.out.println("=========");


        // Example 2: Type code to check if a specific element exists in an array or not
        //             int crr[] = {-12, 23, 5}; check if 23 exists in the array or not

        int crr [] = { -12, 23, 5};

        int counter = 0;
        int element = 23;

        for(int w :crr) {

            if (w == element) {
                counter++;
            }
        }

            if(counter>0){
                System.out.println("It exists");
            }else{
                System.out.println("it does not exist");
            }


    }
}

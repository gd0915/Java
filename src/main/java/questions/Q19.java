package questions;

import java.util.Arrays;

public class Q19 {

    /*
         * create a method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
            */
    public static void main(String[] args) {

        String str = "John";

        stringToCharArray(str);



    }

    public static void stringToCharArray(String str){

        String arr [] = str.split("");

        System.out.println(Arrays.toString(arr));

    }



}

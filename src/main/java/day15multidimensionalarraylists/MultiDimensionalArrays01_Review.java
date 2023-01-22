package day15multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays01_Review {

    public static void main(String[] args) {


        //How to create multidimensional array

        //1.Way
        String arr [][] = new String[4][2];

        //How to print a multidimensional array
        System.out.println(Arrays.deepToString(arr));//[[null, null], [null, null], [null, null], [null, null]]

        //How to assign values to multidimensional array elements

        arr[0][0] = "a";
        arr[0][1] = "b";
        arr[1][0] = "c";
        arr[1][1] = "d";
        arr[2][0] = "e";
        arr[2][1] = "f";
        arr[3][0] = "g";
        arr[3][1] = "h";
        System.out.println(Arrays.deepToString(arr));//[[a, b], [c, d], [e, f], [g, h]]

        //How to create multidimensional array in short way

        String brr[][] = { {"a","b"}, {"c","d"}, {"e","f"}, {"g","h"}};
        System.out.println(Arrays.deepToString(brr));//[[a, b], [c, d], [e, f], [g, h]]

        //How to print a specific element from a multidimensional array
        System.out.println(brr[0][1]);//b

        //How to print a specific element from outer array
        System.out.println(Arrays.deepToString(arr[2]));//[e, f]

        //Example : Type code to find the number of elements in a multidimensional array
        String crr[][] = { {"Tom", "Jim"}, {"Angie"}, {"Carl", "Chris", "Ali"} };

        int sum = 0;
        for(String [] w :crr){
            sum = sum + w.length;

        }
        System.out.println(sum);//6











    }
}

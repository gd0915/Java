package questions_02;

import java.util.Arrays;
import java.util.Comparator;

public class Q01 {

    public static void main(String[] args) {

        /*
        Question 3- For this array : {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};

        //a) Find index of "Sigrund" and  output must be like that --> Index for "Sigrun" is : 2
        //b) Find index of "Einar" and  output must be like that --> Index for "Einar" is : 3

        //c) Sort the array elements in ascending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
        //d) Sort the array elements in descending order according to their lengths. {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};
         */

        String arr [] = {"Vidar", "Michael", "Sigrund", "Maria", "Susanne", "Ole"};

        int idx = Arrays.binarySearch(arr, "Sigrund");
        System.out.println("Index for \"Sigrund\" is : " + idx); //2

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[Maria, Michael, Ole, Sigrund, Susanne, Vidar]

        int idx1 = Arrays.binarySearch(arr, "Einar");
        System.out.println(idx1);//-1 order number

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));//[Ole, Maria, Vidar, Michael, Sigrund, Susanne]

        Arrays.sort(arr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(arr));//[Michael, Sigrund, Susanne, Maria, Vidar, Ole]




    }
}

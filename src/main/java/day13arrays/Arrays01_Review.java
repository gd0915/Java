package day13arrays;

import java.util.Arrays;

public class Arrays01_Review {

    public static void main(String[] args) {


        //Example 1:Create an integer array and print the sum of the first and the last elements on the console

        int ages [] = new int[3];

        ages[0]= 8;
        ages[1]=12;
        ages[2]=15;

        System.out.println(Arrays.toString(ages));
        //1.Way
        System.out.println(ages[0]+ages[1]+ ages[2]);


        //2.Way:

        int sum= 0;

        for(int w : ages){

            sum = sum + w;
        }
        System.out.println(sum); //35

        System.out.println("===============");


        //Example 2: Create a double array and find the sum of all elements in the array
        //           [1.2, 2.3, 5.0, 4.51] ==> 13.01

        double prices [] = {1.2, 2.3, 5.0, 4.51};

        //1.Way:
        System.out.println(prices[0] + prices[1] + prices[2] + prices[3]);

        //2.Way:

        double sum1 = 0;
        for(double w : prices){
            sum1 = sum1 + w;
        }
        System.out.println(sum1); //13.01









    }
}

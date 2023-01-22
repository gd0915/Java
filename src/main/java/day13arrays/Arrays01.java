package day13arrays;

import java.util.Arrays;

public class Arrays01 {

    /*
        When we create byte, short, int, long, float, double, char, boolean containers, we can store just a single value in them,
        but sometimes we need to store multiple values in a single container.
        To be able to store multiple values, Java created a new structure its name is "Array".
        Arrays are stored in the Heap Memory.

        Note: Arrays are to store multiple data in single data types
              You cannot store different data types in an Array
              Arrays cannot store non-primitive data types(the elements cannot be non-primitive).
              Arrays can store primitive data types and the references(the addresses) of non-primitives.

        Note: We have to declare the length of the Array when we are creating an Array
              Arrays are immutable, so we cannot add or remove elements from the Array ==> Fixed size
     */

    public static void main(String[] args) {

        //How to create an Array
        String names [] = new String[5]; //new means create a brand-new Array from scratch

        //How to print an Array
         System.out.println(Arrays.toString(names));//[null, null, null, null, null]
                        // class name + method ==> (toString()) It prints the Array
                                            //In our code there might be more than one Array
                                            //Because of that we should type Array name

          //How to put elements into an Array
        names[1] = "Tom";
        names[4] = "Mark";
        names[0] = "Jim";
        names[2] = "Mary";
        names[3] = "Susan";

        System.out.println(Arrays.toString(names));//[Jim, Tom, Mary, Susan, Mark]

          //How to print a specific element in an Array
        System.out.println(names[3]);//Susan

        //Example 1:Create an integer array and print the sum of the first and the last elements on the console

        int ages [] = new int[9];
        

        System.out.println(Arrays.toString(ages));//[0, 0, 0, 0, 0, 0, 0]

        ages[0] = 10;
        ages[1] = 12;
        ages[2] = 14;
        ages[3] = 16;
        ages[4] = 18;
        ages[5] = 19;
        ages[6] = 20;
        ages[7] = 10;
        ages[8] = 20;

        System.out.println(Arrays.toString(ages));//[10, 12, 14, 16, 18, 19, 20, 10, 20]
        System.out.println(ages[3]);//16
        System.out.println(ages[0] + ages[ages.length-1]);//30


        //Example 2: Create a double array and find the sum of all elements in the array
        //           [1.2, 2.3, 5.0, 4.51] ==> 13.01

        double prices [] = new double[5];

        System.out.println(Arrays.toString(prices));//[0.0, 0.0, 0.0, 0.0, 0.0]

        prices[0] = 1.2;
        prices[1] = 2.3;
        prices[2] = 5.0;
        prices[3] = 4.51;
        prices[4] = 5.51;

        System.out.println(Arrays.toString(prices));//[1.2, 2.3, 5.0, 4.51, 5.51]
        System.out.println(prices[0] + prices [1] + prices[2] + prices [3] +  prices [prices.length-1] );//18.52
                                                                                              //No () after length in Arrays

        //1.Way: To make the code dynamic we did it with loop
        double sum = 0;

        for(int i=0; i<prices.length; i++){

            sum = sum + prices[i];//use brackets

        }
        System.out.println(sum );//18.52


        //2.Way:We will solve the task by using "for-each-loop".
                // It can be used with Arrays and Collections

        double summy = 0;

                            //[1.2, 2.3, 5.0, 4.51, 5.51]
        for(double w : prices){

            summy = summy +w;

        }
        System.out.println(summy);//18.52



    }
}

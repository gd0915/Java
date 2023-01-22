package day13arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: Create a String Array and print the elements in alphabetical order on the console in different lines

        String cities[] = new String[5];

        cities[0] = "Tokyo";
        cities[1] = "Berlin";
        cities[2] = "Istanbul";
        cities[3] = "Jacksonville";
        cities[4] = "Calgary";

        System.out.println(Arrays.toString(cities));//[Tokyo, Berlin, Istanbul, Jacksonville, Calgary]

        //How to put elements in alphabetical order   ==>Arrays.sort(cities)
        Arrays.sort(cities);

        System.out.println(Arrays.toString(cities));//[Berlin, Calgary, Istanbul, Jacksonville, Tokyo]

        //by using for-each-loop
        for(String w : cities){

            System.out.println(w + " ");
        }

        System.out.println();

        //Note : To get the number of characters from a String use length()
        //       To get number of elements from an array use just "length"

        //Example 2: Create a String Array and print the elements whose length is less than 5
        //Short way to create an array and add elements into the array

        String names [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        System.out.println(Arrays.toString(names));//[Ali, Thomas, Mark, Jackson, Tom, Martin]

        for(String w : names) {

            if (w.length() < 5) {
                System.out.print (w + " ");
            }

        }   //Ali Mark Tom

        System.out.println();


        //Example 3: Create a String Array and print the elements before "Tom"

        String students [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w : students){

            if(w.equals("Tom")){
                break;
            }
            System.out.print(w + " ");//Ali Thomas Mark Jackson
        }

        //Note: "break" keyword break the loop in loops
        //      "break" keyword will take you the outside the switch in Switch statement
        System.out.println("================");

        //Example 4: Create a String Array and print the elements before "Tom" and "Tom"

        for(String w : students){

            System.out.print(w + " ");

            if(w.equals("Tom")){
                break;
            }

        }  //Ali Thomas Mark Jackson Tom

        System.out.println("=================");

        //Example 5: Create a String Array and print the elements different from "Tom"


        String students1 [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w : students1){
            if(w.equals("Tom")) {
                continue;
            }
                System.out.print(w + " ");
            }   //Ali Thomas Mark Jackson Martin







    }

}

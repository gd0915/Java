package day13arrays;

import java.util.Arrays;

public class Arrays02_Review {

    public static void main(String[] args) {

        //Example 1: Create a String Array and print the elements in alphabetical order on the console in different lines

        String cities[] = {"Tokyo", "Berlin", "Istanbul", "Jacksonville", "Calgary"};

        System.out.println(Arrays.toString(cities));//[Tokyo, Berlin, Istanbul, Jacksonville, Calgary]

        Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));//[Berlin, Calgary, Istanbul, Jacksonville, Tokyo]

        //by using for-each-loop
        for(String w : cities){
            System.out.print(w + " ");
        }


        System.out.println("================");

        //Example 2: Create a String Array and print the elements whose length is less than 5

        String names [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};
        String newNames = "";

        for( String w : names){
            if(w.length()<5){
                newNames = newNames + w + " ";
            }
        }
        System.out.println(newNames); //Ali Mark Tom

        System.out.println("================");

        //Example 3: Create a String Array and print the elements before "Tom"
        String students [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w : students){
            if(w.equals("Tom")){
                break;
            }
            System.out.print(w + " ");//Ali Thomas Mark Jackson
        }


        System.out.println("===============");


        //Example 4: Create a String Array and print the elements before "Tom" and "Tom"
        String nameOfStudents [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w : nameOfStudents){
            System.out.print(w + " ");

            if(w.equals("Tom")){
                break;
            }
        }
        //Ali Thomas Mark Jackson Tom


        System.out.println("================");

        //Example 5: Create a String Array and print the elements different from "Tom"
        String names2 [] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w : names2){
            if(w.equals("Tom")){
                continue;
            }
            System.out.print(w + " "); //Ali Thomas Mark Jackson Martin
        }


    }
}

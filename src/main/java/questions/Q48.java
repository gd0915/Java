package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q48 {

    // Find the sum of the least and the greatest price given in a String list
    // Example: List myList = new List{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

    public static void main(String[] args) {

         List<String> myList= Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");

         List<Double> doublePrice = new ArrayList<>();
         for(String w : myList){

             double price = Double.valueOf(w.replace("$", ""));
             doublePrice.add(price);
         }
        System.out.println(doublePrice);// [12.99, 8.25, 23.6, 54.45]

        Collections.sort(doublePrice);
        System.out.println(doublePrice);//[8.25, 12.99, 23.6, 54.45]

        System.out.println("The sum of the least and the greatest price is " + (doublePrice.get(0) + doublePrice.get(doublePrice.size()-1)));


















    }
}

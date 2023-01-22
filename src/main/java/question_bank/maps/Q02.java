package question_bank.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q02 {

    //There is a Map which contains product names as key and number of the products as value.
    //Type code to check if ‘Laptop’ is among the products
    //And get its value
    //And then print the values in ascending order


    public static void main(String[] args) {

        Map<String, Integer> product = new HashMap<>();
        product.put("Fridge", 90);
        product.put("TV", 27);
        product.put("Washing Machine", 36);
        product.put("Computer", 16);
        product.put("LapTop", 19);

        String expectedProduct = "LapTop";

        if(product.containsKey(expectedProduct)){
            System.out.println(expectedProduct + " exists and its value is " + product.get(expectedProduct));
        }else{
            System.out.println(expectedProduct + " does not exists");
        }

        Object[] ascendingValues = product.values().toArray();
        Arrays.sort(ascendingValues);
        System.out.println(Arrays.toString(ascendingValues));




    }
}

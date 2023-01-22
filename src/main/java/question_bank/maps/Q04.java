package question_bank.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q04 {

    //There is a Map which contains product names as key and number of the products as value.
    //Print the product names in alphabetical order.

    public static void main(String[] args) {

        Map<String, Integer> product = new HashMap<>();
        product.put("Fridge", 90);
        product.put("TV", 27);
        product.put("Washing Machine", 36);
        product.put("Computer", 16);
        product.put("LapTop", 19);

        Object [] keys = product.keySet().toArray();
        Arrays.sort(keys);
        System.out.println(Arrays.toString(keys));







    }
}

package question_bank.maps;

import java.util.*;

public class Q03 {

    //There is a Map which contains product names as key and prices of the products as value.
    //Print the prices in ascending order

    public static void main(String[] args) {

        Map<String, Integer> product = new HashMap<>();
        product.put("LapTop", 3500);
        product.put("Fridge", 4000);
        product.put("TV", 2500);
        product.put("Sofa", 1800);
        product.put("Drawer", 900);

        System.out.println(product);
        System.out.println(product.values());

        Object[] productPrices =  product.values().toArray();

        Arrays.sort(productPrices);
        System.out.println(Arrays.toString(productPrices));















    }
}

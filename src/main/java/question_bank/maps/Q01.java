package question_bank.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q01 {

    //There is a Map which contains product names as key and number of the products as value.
    //Type code to find the total number of products

    public static void main(String[] args) {

        Map<String, Integer> product = new HashMap<>();
        product.put("Fridge", 90);
        product.put("TV", 27);
        product.put("Washing Machine", 36);
        product.put("Computer", 16);

        Collection<Integer> values =  product.values();
        System.out.println(values);

        int sum=0;
        for(Integer w : values) {

            sum += w;
        }
        System.out.println(sum);//169



    }
}

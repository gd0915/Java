package question_bank.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists_Q10 {

    public static void main(String[] args) {

        //Find the sum of the least and the greatest price given in a String list
        //Example: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$8.25");
        myList.add("$54.45");

        List<Double> d = new ArrayList<>();

        for(String w : myList){
             double price = Double.valueOf(w.replace("$",""));
             d.add(price);
        }
        Collections.sort(d);
        System.out.println(d);//[8.25, 12.99, 23.6, 54.45]
        double sum = d.get(0) + d.get(d.size()-1);
        System.out.println(sum);//62.7








    }
}

package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q51 {

    /*
    Type a code to find the duplicate element in String Array
       {"learn","Java","love","Java","learn","coding"}
     */

    public static void main(String[] args) {

        String [] arr =  {"learn","Java","love","Java","learn","coding"};

        Map<String, Integer> myMap = new HashMap<>();

        for(String w : arr){

            Integer numOfOccurrence = myMap.get(w);

            if(numOfOccurrence == null){

                myMap.put(w,1);
            }else{
                myMap.put(w, numOfOccurrence+1);
            }
           }
                System.out.println(myMap);



        Set<Map.Entry<String, Integer>> entries =  myMap.entrySet();

        for(Map.Entry<String, Integer> w : entries){

            if(w.getValue()>1){
                System.out.println(w.getKey());
            }
        }









    }
}

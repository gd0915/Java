package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q45 {


    public static void main(String[] args) {

        //Type a code  to find the duplicate values of an Integer array / of integer values.

//        Integer[] arr = {10, 12, 14, 23, 46, 52, 12, 10, 67};
//            for (int i = 0; i < arr.length; i++) {
//
//                for (int k = i + 1; k < arr.length; k++) {
//
//                    if (arr[i] == (arr[k])) {
//
//                        System.out.print(arr[i] + " ");
//                    }
//                }
//            }

//        Integer[] arr = {10, 12, 14, 23, 46, 52, 12, 10, 67, 58, 58, 10, 10};
//        HashMap<Integer, Integer> counter = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            int counter1 = 1;
//            for (int k = i + 1; k < arr.length; k++) {
//                if (arr[i] == (arr[k])) {
//                    counter1++;
//                    counter.put(arr[i], counter1);
//                }
//
//            }
//
//        }
//        System.out.println(counter);

        Integer[] arr = {10, 12, 14, 23, 46, 52, 12, 10, 67, 58, 58, 10, 10};
        Map<Integer, Integer> myMap = new HashMap<>();

        for(Integer w : arr){

            Integer numOfOccurrence = myMap.get(w);

            if(numOfOccurrence == null){
                myMap.put(w,1);
            }else{
                myMap.put(w, numOfOccurrence+1);
            }
        }
        System.out.println(myMap);

        Set<Map.Entry<Integer, Integer>> entries = myMap.entrySet();

        for(Map.Entry<Integer, Integer> w : entries){
            if(w.getValue() >1){
                System.out.println(w.getKey() + " is duplicate");
            }
        }









    }
}
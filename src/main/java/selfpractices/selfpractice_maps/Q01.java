package selfpractices.selfpractice_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class Q01 {

    public static void main(String[] args) {

    /*
     Q1/
     Count the number of characters in the given String and print HashMap and sort alphabetical order
     */

        String queen ="We are the champions, my friends, And we'll keep on fighting till the end";

        String [] chars = queen.toLowerCase().
                replaceAll("\\p{Punct}", "").
                replaceAll("\\s", "").
                split("");

        System.out.println(Arrays.toString(chars));

        HashMap<String, Integer> myMap = new HashMap<>();

        for(String w : chars){

            Integer numOfOcc = myMap.get(w);

            if(numOfOcc==null){
                myMap.put(w,1);
            }else{
                myMap.put(w, numOfOcc +1);
            }
        }
        System.out.println(myMap);


//        TreeMap<String, Integer> list = new TreeMap<>(chList);
//
//        System.out.println(list);



    }
}

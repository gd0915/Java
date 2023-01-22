package questions;

import java.util.HashMap;
import java.util.Map;

public class Q80 {

    //Type a Java program to show the frequency of the letters in a given String

    public static void main(String[] args) {

        String str = "aaabbccd";
        String [] arr= str.split("");

        //1.Way

        String sum ="";
        for(int i=0; i<arr.length; i++){
            int counter =0;
            for(int j= 0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    counter++;

                }
            }
        if(!sum.contains(arr[i])){
                sum += arr[i]+ counter + " ";
        }
        }
        System.out.println(sum);


        //2.Way: By using HashMap

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        System.out.println(map);

        //3.Way : By using HashMap and For Each Loop

        Map<String, Integer> map1 = new HashMap<>();
        for(String w : arr){

            Integer numOfOccurrences = map1.get(w);

            if(numOfOccurrences == null){
                map1.put(w, 1);
            }else{
                map1.put(w, numOfOccurrences+1);
            }
        }
        System.out.println(map1);
    }
}

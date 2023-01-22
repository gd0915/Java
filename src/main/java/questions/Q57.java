package questions;

import java.util.HashMap;
import java.util.Map;

public class Q57 {

    /*
          Create a method that count the number of the occurrences of the characters in a given String by using HashMap
          Test Data:
          Input = "AAABBCDD"
          Output = A3B2C1D2
         */

    public static void main(String[] args) {

        String str = "AAABBCDD";

        //1.Way: by using HashMap

        String [] arr = str.split("");
        Map<String, Integer> myMap = new HashMap<>();


        for(String w : arr) {
            Integer numOfOccurrence = myMap.get(w);
            if (numOfOccurrence == null) {
                myMap.put(w, 1);
            } else {
                myMap.put(w, numOfOccurrence + 1);
            }
        }
        System.out.println(myMap);

            System.out.println();

        //2.Way: by using for loop

        String result = "";
        for(int i = 0; i<str.length(); i++){
            int counter1 = 0;
            for(int j = 0; j<str.length(); j++){

                if(str.substring(i, i+1).equals(str.substring(j, j+1))){
                    counter1++;
                }
            }
            if(!result.contains(str.substring(i,i+1))){
                result += str.substring(i,i+1) + counter1 + " ";
            }
        }
        System.out.println(result);















    }
}

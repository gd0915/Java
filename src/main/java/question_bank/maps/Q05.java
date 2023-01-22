package question_bank.maps;

import java.util.HashMap;
import java.util.Map;

public class Q05 {

    //Type code to count the number of occurrences of the words in a String. (Case insensitive)

    public static void main(String[] args) {

        String str = "Apex is easy. Type codes to learn apex. To earn money learn apex.";

        String [] arr = str.toLowerCase().replaceAll("\\p{Punct}", "").split(" ");

        Map<String, Integer> wordOccurrence = new HashMap<>();

        for( String w : arr){

            Integer numOfOccurrence = wordOccurrence.get(w);

            if(numOfOccurrence == null){
                wordOccurrence.put(w, 1);
            }else{
                wordOccurrence.put(w, numOfOccurrence+1);
            }

        }
        System.out.println(wordOccurrence);













    }
}

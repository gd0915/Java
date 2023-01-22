package recap02;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap_Q02 {

    public static void main(String[] args) {

        //Question 2: Type code to print the number of occurrences of letters in a sentence

        String sentence2 = "I like to move it, move it do you like it";

        sentence2 =  sentence2.replaceAll("\\p{Punct}", "").replaceAll("\\s", "");
        System.out.println(sentence2);

        String [] letters = sentence2.split("");
        System.out.println(Arrays.toString(letters));

        HashMap<String, Integer> occurrenceLetters = new HashMap<>();

        for(String w : letters){

            Integer numOfOccurrenceOfLetters  = occurrenceLetters.get(w);

            if(numOfOccurrenceOfLetters== null){
                occurrenceLetters.put(w, 1);
            }else{
                occurrenceLetters.put(w, numOfOccurrenceOfLetters + 1);
            }
        }
        System.out.println(occurrenceLetters);//{t=4, d=1, e=4, u=1, v=2, I=1, i=5, y=1, k=2, l=2, m=2, o=5}










    }
}

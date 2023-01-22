package recap01;

import java.util.Arrays;
import java.util.HashMap;

public class QuestionsCoding_Maps {

    //Question 1:
    //Type code to print the number of occurrences of words in a sentence
    //"I like to move it, move it do you like it" => I=1, like=2, to=1, move=2, it=3, do=1, you=1
    //Interview Question!!!!!!!!!!!

    public static void main(String[] args) {

        String str = "I like to move it, move it do you like it";

        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);

        String words [] = str.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> occurrenceMap = new HashMap<>();

        for(String w : words ){

            Integer numOfOccurrence = occurrenceMap.get(w);

            if(numOfOccurrence==null){
                occurrenceMap.put(w, 1);
            }else{
                occurrenceMap.put(w, numOfOccurrence+1);
            }
        }
        System.out.println(occurrenceMap);

        System.out.println("==================");

        //Question  2) Question 2: Type code to print the number of occurrences of letters in a sentence
        //Interview Question!!!!!!!!!!!

        String s = "I like to move it, move it do you like it";

        s = s.replaceAll("\\s", "");
        String letter [] = s.split("");

        HashMap<String, Integer> occurrenceLetter = new HashMap<>();

        for(String w : letter){

             Integer numOfOccurrence1 = occurrenceLetter.get(w);

             if(numOfOccurrence1 == null){

                 occurrenceLetter.put(w, 1);
             }else{
                 occurrenceLetter.put(w, numOfOccurrence1+1);
             }

        }
        System.out.println(occurrenceLetter);

    }
}

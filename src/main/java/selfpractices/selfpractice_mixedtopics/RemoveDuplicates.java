package selfpractices.selfpractice_mixedtopics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    //Task: Remove Duplicates From the given  String

    public static void main(String[] args) {
        System.out.println(removeDuplicatesFromAString1("someone"));
        System.out.println(removeDuplicatesFromAString2("someone"));
    }

    //1st Way:
    public static String removeDuplicatesFromAString1(String word){
        String result="";
        String memory="";

        for(int i=0; i<word.length(); i++){
            String str = "" + word.charAt(i);
            if(!memory.contains(str)){
                result += str;
            }
            memory += str;
        }

        return result;
    }

    //2nd Way:
    public static String removeDuplicatesFromAString2(String word) {
        List<String> allChars = Arrays.asList(word.split(""));
        List<String> withoutDuplicates = allChars.stream().distinct().collect(Collectors.toList());
        // return withoutDuplicates; //This will return the all distinct chars as a List

        //return all distinct chars as a String
        String result = "";
        for(String eachChar : withoutDuplicates){
            result += eachChar;
        }
        return result;
    }
}

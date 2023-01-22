package question_bank.string_manipulations;

import org.w3c.dom.ls.LSOutput;

public class StringManipulations_Q17 {
    /*
     Type a code to find the number of punctuation marks used in a String.
     */
    public static void main(String[] args) {


        String str = "Wow! Ali is 13 years old, but he is a university student.";

        //1.Way:

        int numberOfPunctuationMarks = str.replaceAll("\\P{Punct}", "").length();
        System.out.println(numberOfPunctuationMarks);

        //2.Way:
        int numberOfPunctuationMarks1 = str.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(numberOfPunctuationMarks1);

        //2.Way:

        int totalNumberOfCharacters = str.length();
        int charsDiffFromPunctuationMarks = str.replaceAll("\\p{Punct}", "").length();
        int numOfPunctuationMarks = totalNumberOfCharacters - charsDiffFromPunctuationMarks;
        System.out.println(numOfPunctuationMarks);




    }
}

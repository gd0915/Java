package day07_practicesessionifelsestatement;

public class PracticeDay02_Q07_StringManipulations {
    // Type a code to find the number of punctuation marks used in a String.

    public static void main(String[] args) {

        String str= "Wow!...Ali is 13 years old, and he is a university student.";

        int totalNumOfChar = str.length();
        System.out.println(totalNumOfChar);

        String strWithoutPunct =str.replaceAll("\\p{Punct}","");

            // "\\p" means all the punctuation values.
            //regular expression for ALL punctuations can be typed "\\p" ==> By replaceAll() punctuation will be replaced with nothing.
            //So, we can find the number of characters in the statement.

        //"P" put only punctuations but "p" put out punctuations.

        System.out.println(strWithoutPunct.length());
        System.out.println(totalNumOfChar - strWithoutPunct.length());

        //easier way:

        System.out.println(str.replaceAll("\\P{Punct}", "").length());


    }
}

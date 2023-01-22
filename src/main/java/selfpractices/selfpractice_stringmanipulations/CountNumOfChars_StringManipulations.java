package selfpractices.selfpractice_stringmanipulations;

public class CountNumOfChars_StringManipulations {
    /*
    Question 7-  Find the number of character "a" in this String.   String s = "Java, I like Java?"
     */

    public static void main(String[] args) {

        String str = "Java, I like Java?";

        int numOfAllCharsDiffFromA = str.replaceAll("a","").length();
        int allChars = str.length();
        System.out.println( allChars - numOfAllCharsDiffFromA);









    }






}

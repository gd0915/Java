package question_bank.string_manipulations;

public class StringManipulations_Q04 {

    /*
        Create a String variable, print the number of non-digit characters in the String on the
        console.
        Example: If the String is ‘1a3Bcf4!...’ you need to print 8 on the console.
     */

    public static void main(String[] args) {

        String str = "Ali3546!* Can89!^+";

        System.out.println("The number of non-digit characters is " + str.replaceAll("[0-9]","").length());

        String s = "2a3B4?-!5";
        Integer numOfNonDigitChars = s.replaceAll("[0-9]","").length();
        System.out.println("Total number of non-digit characters: " + numOfNonDigitChars);








    }
}

package question_bank.string_manipulations;

public class StringManipulations_Q12 {

    /*
            Type code to check if a String has an uppercase initial and dot at the end.
            Example: For ‘Ali’ your code should print false on the console
                 For ‘ali.’ your code should print false on the console
                 For ‘ Ali. ’ your code should print false on the console
                 For ‘Ali.’ your code should print true on the console
                 For ‘ALI.’ your code should print true on the console
     */

    public static void main(String[] args) {

        String str ="Ali";

        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);

        Boolean isTheFirstCharUpperCase =firstChar>='A' && firstChar<='Z';
        Boolean isTheLastCharDot = lastChar=='.';
        //Boolean isTheLastCharDot= str.endsWith(".");

        Boolean isFirstUpperAndLastDot = isTheFirstCharUpperCase && isTheLastCharDot;
        System.out.println("Does String has an uppercase initial and dot at the end: " + isFirstUpperAndLastDot);








    }
}

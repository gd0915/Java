package question_bank.string_manipulations;

public class StringManipulations_Q09 {

    /*
            Create a String variable and print all characters except the first character and the last
            character on the console in upper cases.
            Example:If the String is ‘Java’ you should print ‘AV’ on the console.
     */

    public static void main(String[] args) {

        String str ="I like to learn Java";

        String firstCharacter = str.substring(0,1);
        String lastCharacter= str.substring(str.length()-1);
        int indexOfLastCharacter = str.length()-1;

        String allCharsExceptFirstLastCharacters = str.substring(1,indexOfLastCharacter).replaceAll("\\s","");

        System.out.println("All characters except first and last characters in the given String are:  " + allCharsExceptFirstLastCharacters.toUpperCase());







    }
}

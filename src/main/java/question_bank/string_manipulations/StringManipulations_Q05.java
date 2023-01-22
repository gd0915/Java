package question_bank.string_manipulations;

public class StringManipulations_Q05 {
    /*
        Create a String variable and print just the last non-space character on the console for any
        String.
        Example: For ‘Ali Can’ you should print n
        For ‘Miami ’ you should print i etc.
     */

    public static void main(String[] args) {

        String str = "Tom Hanks";

//        int indexOfLastNonSpaceCharacter = str.trim().length()-1;
//        String lastNonSpaceCharacter = str.substring(indexOfLastNonSpaceCharacter,indexOfLastNonSpaceCharacter+1);
//
//        System.out.println("The last non-space character is " + lastNonSpaceCharacter);


        String lastCharacter = str.trim().substring(str.length()-1);
        System.out.println("The last non-space character is " + lastCharacter);






    }
}

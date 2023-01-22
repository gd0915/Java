package question_bank.string_manipulations;

public class StringManipulations_Q06 {

    /*
    Create a String variable and find the sum of the ASCII values of the first and the last
    characters of the String.
     */

    public static void main(String[] args) {

        String str = "Tom Hanks";

       char firstCharacter = str.charAt(0);
       char lastCharacter = str.charAt(str.length()-1);

        System.out.println("The sum of the ASCII values of the first and last characters is " + (firstCharacter + lastCharacter));






    }
}

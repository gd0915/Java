package question_bank.string_manipulations;

public class StringManipulations_Q08 {
    /*
        Create a String variable and print all characters except the last character on the console in
        upper cases.
        Example:If the String is ‘Java’ you should print ‘JAV’ on the console.
     */

    public static void main(String[] args) {

        String str = "Java";

        //String lastCharacter = str.substring(str.length()-1);//This is not numeric data. EWe cannot put it into the substring () method parenthesis, so
                                                               //We convert it first into Integer Wrapper Class.

        Integer indexOfLastCharacter =str.length()-1;

        String allCharsExceptLastChar = str.substring(0,indexOfLastCharacter).toUpperCase();

        System.out.println(allCharsExceptLastChar);










    }
}

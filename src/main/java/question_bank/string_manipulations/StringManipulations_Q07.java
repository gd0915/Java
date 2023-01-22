package question_bank.string_manipulations;

public class StringManipulations_Q07 {
    /*
        Create a String variable and print all characters except the first character on the console.
        Example:If the String is ‘Java’ you should print ‘ava’ on the console.
     */

    public static void main(String[] args) {

        String str = "Tom Hanks";
        String firstCharacter = str.substring(0,1).replace("0","");
        String restOfStr = str.substring(1).replaceAll("\\s","");

        System.out.println(restOfStr);







    }
}

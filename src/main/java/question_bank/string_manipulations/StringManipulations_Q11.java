package question_bank.string_manipulations;

public class StringManipulations_Q11 {
    /*
        Type code to check if a String does not have any space character at the beginning and at
        the end?
        Example: For ‘ Ali ’ your code should print false on the console
        For ‘Ali’ your code should print true on the console
     */

    public static void main(String[] args) {

        String str ="Ali ";

        //My code:
        String trimmed = str.trim();
        boolean result =  str.length()-trimmed.length() !=0;

        System.out.println("Is there space at the beginning and/or at the end? " + result);

        //Question Bank:
        String trimmedString = str.trim();
        Boolean result2 = str.equals(trimmedString);
        System.out.println("Is there space at the beginning and/or at the end? " + !result2);








    }
}

package question_bank.string_manipulations;

public class StringManipulations_Q10 {

    /*
            Type code to check if a String has just a single space character any position in the middle
            Example: For ‘Ali     Can’ your code should print false on the console
            For ‘   Ali Can   ’ your code should print false on the console
            For ‘  Ali    Can   ’ your code should print false on the console
            For ‘Ali Can’ your code should print true on the console
     */

    public static void main(String[] args) {

        String str = "  Ali     Can    ";

        String trimmed = str.trim();

        String allExceptSpace = trimmed.replaceAll("\\s", "");

        Boolean isThereSpaceInTheMiddle = trimmed.length()-allExceptSpace.length()==1;

        System.out.println("Is there a single space in the middle of the given String: " + isThereSpaceInTheMiddle);








    }
}
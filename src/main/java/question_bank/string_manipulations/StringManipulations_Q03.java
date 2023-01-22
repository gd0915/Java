package question_bank.string_manipulations;

public class StringManipulations_Q03 {
    /*
        Create a String variable, print the total number of alphabetical and numeric characters in
    the String on the console.
    Example: If the String is ‘ Miami 33018!!! ’ you need to print 10 on the console
         */


    public static void main(String[] args) {

        //Example 1:
        String str = "Miami 33018";

        System.out.println("Total number of alphabetical and numeric characters is" + str.replaceAll("\\s","").length());

        //Example 2:

        String s = " Miami 33018!!! ";
        Integer numOfChars = s.replaceAll("\\s","").replaceAll("[^A-Za-z0-9]","").length();
        System.out.println("Total num of alphabetical and numeric characters chars:" + numOfChars);






    }
}

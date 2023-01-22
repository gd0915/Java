package question_bank.string_manipulations;

public class StringManipulations_Q02 {
    /*
            Create 3 String variables for people's names. Print the sum of the number of characters in
        all the 3 names except space characters.
        Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.
     */

    public static void main(String[] args) {


        String name1 ="Ali Can";
        String name2 ="Tom Hanks";
        String name3 ="David Copperfield";

        System.out.println(name1.replaceAll("\\s","").length() + name2.replaceAll("\\s","").length() +
                name3.replaceAll("\\s","").length());




    }
}

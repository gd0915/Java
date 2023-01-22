package day07_practicesessionifelsestatement;

public class PracticeDay02_Q03_StringManipulations {

    /*
        String shirtPrice= "$ 12.99";
        String bookPrice= "$ 35.99";

        Type a code to find the sum of the shirt and book prices.
     */
    public static void main(String[] args) {

        String shirtPrice = "$ 12.99";
        String bookPrice = "$ 35.99";

        String shirt = shirtPrice.replace("$ ","");//12.99 ==>We replace "$" sign  with "" nothing in this code replace(char..)
        String book = bookPrice.replace("$ ","");//35.99

        //If we put a space after $ sign in the replace method, Java will remove $ and the space coming after $ with nothing.

        //How can I convert String to Double? We should use "Double" Wrapper Class and put "dot"
        //We can convert strings to double numeric values because it is not possible to operate math operations with Strings

        double sd = Double.valueOf(shirt);//
        double bd = Double.valueOf(book);

        System.out.println(sd + bd);




    }
}

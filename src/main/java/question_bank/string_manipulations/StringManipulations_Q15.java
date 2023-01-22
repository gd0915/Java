package question_bank.string_manipulations;

public class StringManipulations_Q15 {
    /*
        String shirtPrice = ‘$12.99’;
        String bookPrice = ‘$35.99’;
        Type code to find the sum of the shirt and book prices.
     */

    public static void main(String[] args) {

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String shirt = shirtPrice.replace("$","");
        String book = bookPrice.replace("$","");

        Double shirtInDouble = Double.valueOf(shirt);
        Double bookInDouble = Double.valueOf(book);

        System.out.println("The sum of the shirt and book prices: " + (shirtInDouble+bookInDouble));




    }
}

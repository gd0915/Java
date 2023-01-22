package question_bank.string_manipulations;

public class StringManipulations_Q14 {
    /*
        Type code to check if a String has a specific single character or not in three different ways.
     */

    public static void main(String[] args) {

        String str= "I love Java!";

        //1.Way:

        Boolean result = str.contains("!");
        System.out.println("Does the character exist: " + result);

        //2.Way:

        Boolean result1 = str.replace("[^!]", "").length()>0;
        System.out.println("Does the character exist: " + result1);

        //3.Way:

        Boolean result2 = str.indexOf("!") != -1;
        System.out.println("Does the character exist: " +result2);









    }
}

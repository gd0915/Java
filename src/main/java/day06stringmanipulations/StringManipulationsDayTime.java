package day06stringmanipulations;

public class StringManipulationsDayTime {

    public static void main(String[] args) {


        //Count the alphabetical characters in a given String
        //TomHanks!...==>

//        String name = "         Tom12     Hanks!....          ";
//
//        int numOfLetters = name.replaceAll("[^A-Za-z]","").length();
//        System.out.println(numOfLetters);


        //"^" : Anything else except the given characters

        /*
        If your code gives you correct output for some data, but if it is not giving you correct output for some other data this
        is called "Hard Coding".
        It is not accepted.

        If your code works for all data it is called "Dynamic Coding".
         */

        String name2 = "Tom12";

        int numOfLetters2 = name2.replaceAll("[^A-Za-z]","").length();
        System.out.println(numOfLetters2);














    }
}
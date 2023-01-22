package question_bank.arrays;

public class Arrays_Q05 {

    public static void main(String[] args) {

        /*
            Find the total number of characters used in String array elements
            Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26
         */

        String str[]= {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        int numOfElements = str.length;
        System.out.println(numOfElements);//5

        int sum = 0;

        for(String w : str){
            sum = sum + w.length();
        }
        System.out.println(sum);//26


    }
}

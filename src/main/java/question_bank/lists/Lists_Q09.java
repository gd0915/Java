package question_bank.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists_Q09 {

    /*Find the sum of all prices given in a String list
    Example: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
    */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        System.out.println(myList);
        double sum =0;

        for(String w : myList){
            sum = sum + Double.valueOf(w.replace("$", ""));
        }
        System.out.println(sum );



    }
}
package question_bank.sets;

import java.util.*;

public class Q02_Sets {

    //Type code to print different characters used in a String
    //Example: ‘Mississippi’ ==> Misp

    public static void main(String[] args) {

        String str = "Mississippi";
        String [] arr = str.split("");
        List<String> characters = Arrays.asList(arr);

        Set<String> mySet = new HashSet<>(characters);
        System.out.println(mySet);


    }


}

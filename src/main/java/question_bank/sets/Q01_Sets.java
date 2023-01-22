package question_bank.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q01_Sets {

    //Type the code that shows how many different elements there are in a list.
    //Example: {10, 31, 15, 7, 15, 7, 7} ==> 4

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);

        Set<Integer> mySet = new HashSet<>(myList);
        System.out.println(mySet.size());



    }

}

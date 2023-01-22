package question_bank.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q04_Sets {

    //Type code to print the different elements in a Set from a List

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(17);
        myList.add(24);
        myList.add(52);
        myList.add(60);

        Set<Integer> mySet = new HashSet<>();
        mySet.add(12);
        mySet.add(23);
        mySet.add(17);
        mySet.add(52);
        mySet.add(64);
        mySet.add(60);

        mySet.removeAll(myList);
        System.out.println(mySet);








    }
}

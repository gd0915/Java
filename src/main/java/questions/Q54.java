package questions;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Q54 {

    // Find max and min element in this array with help HashSet  -->{1, -5, 2, 4, 7, -6}


    public static void main(String[] args) {

        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(-5);
        mySet.add(2);
        mySet.add(4);
        mySet.add(7);
        mySet.add(-6);

//        TreeSet<Integer> ascendingSet = new TreeSet<>(mySet);
//        System.out.println(ascendingSet);
//        System.out.println(ascendingSet.pollFirst());
//        System.out.println(ascendingSet.pollLast());


        System.out.println(Collections.max(mySet));
        System.out.println(Collections.min(mySet));



    }
}

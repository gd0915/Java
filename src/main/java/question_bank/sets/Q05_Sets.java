package question_bank.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q05_Sets {

    //Type code to check if a List has repeated elements or not

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(21);
        myList.add(17);
        myList.add(24);
        myList.add(52);
        myList.add(60);
        myList.add(60);

        Set<Integer> mySet = new HashSet<>(myList);

        if(myList.size()>mySet.size()){
            System.out.println("The list has repeated elements");
        }else{
            System.out.println("The list does not have repeated elements");
        }










    }
}

package question_bank.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists_Q01 {

    public static void main(String[] args) {

        //Example 1) Find the sum of all list elements in an integer list

        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(34);
        myList.add(31);
        myList.add(23);
        myList.add(88);
        myList.add(13);
        myList.add(15);

        int numOfAllElements = myList.size();
        System.out.println(numOfAllElements);//7

        int sum = 0;

        for(Integer w : myList){
            sum = sum + w;
        }
        System.out.println(sum);//207






    }
}

package question_bank.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists_Q02 {
    /*
    Find the sum of all list elements before the first occurrence of 13 in an integer list
     */
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(34);
        myList.add(13);
        myList.add(23);
        myList.add(88);
        myList.add(13);
        myList.add(15);

        int sum = 0;
        for (Integer w : myList) {

            if (w == 13) {
                break;
            } else
                sum = sum + w;
        }
        System.out.println(sum);











    }
}

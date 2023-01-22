package question_bank.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists_Q03{
    public static void main(String[] args) {

        //Find the multiplication of all even list elements in an integer list

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);

        int multiplication = 1;
        for (int w : myList) {
            if (w % 2 == 0) {
                multiplication = multiplication * w;
            }
        }
        System.out.println(multiplication);







    }
}

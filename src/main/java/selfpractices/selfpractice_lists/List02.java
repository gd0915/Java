package selfpractices.selfpractice_lists;

import java.util.ArrayList;
import java.util.List;

public class List02 {

    public static void main(String[] args) {

        // If the list has 15 as element, change all 15s to 51
        //       Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)


        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(11);
        myList.add(15);
        myList.add(34);
        myList.add(43);
        myList.add(15);


        if(myList.contains(15)) {
            for (Integer w : myList) {

                if (w == 15) {
                    myList.set(myList.indexOf(w), 51);
                }
            }
        }else{
            System.out.println("There is no expected element");
        }
        System.out.println(myList);//[12, 11, 51, 34, 43, 51]

















    }
}

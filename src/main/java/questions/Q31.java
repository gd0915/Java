package questions;

import java.util.ArrayList;
import java.util.List;

public class Q31 {

    //Remove the element from the list whose length is more than 4

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jane");
        myList.add("Chris");
        myList.add("Aleksandra");
        myList.add("Brain");
        System.out.println(myList);

        for(int i =0; i<myList.size(); i++){

            if(myList.get(i).length() >4){
                myList.remove(myList.get(i));
                i--;
            }
        }
        System.out.println(myList);




    }
}

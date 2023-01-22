package questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q67 {

    //By using Iterator remove a specific element from an Integer List

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(19);
        list.add(21);
        list.add(35);


        Iterator<Integer> itr = list.iterator();

        int removeIt = 19;
        while(itr.hasNext()){

            Integer element = itr.next();
            if(element==removeIt){
                itr.remove();
            }
        }
        System.out.println(list);




    }
}

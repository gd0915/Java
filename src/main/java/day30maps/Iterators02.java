package day30maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {

        //Example 1: Increase the numbers in a List by 20 percent then print the elements in the reverse order of the given order
        //           [20, 60, 30, 100] ==> [24, 72, 36, 120] ==> [120, 36, 72, 24]

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(60);
        list.add(30);
        list.add(100);
        System.out.println(list);

        ListIterator<Integer> itr = list.listIterator(); //Using ListIterator

        while(itr.hasNext()){

            itr.next();

        }

        while(itr.hasPrevious()){

           Integer el =  itr.previous();
           itr.set(el*120/100);    //(el + (el * 20)/100)
        }
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);//[120, 36, 72, 24]

    }
}

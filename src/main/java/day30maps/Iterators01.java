package day30maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class
Iterators01 {

    public static void main(String[] args) {

        /*
        An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
        It is called an "iterator" because "iterating" is the technical term for looping.
        To use an Iterator, you must import it from the java.util package.

        We have for loop, while loop, do-while-loop and for-each-loop.
        For-each-loop is better to use because it is easier to use and its performance is better than the others.
        (It has less time complexity, it works faster)
        But by using for-each-loop it is impossible to remove or modify a collection.
        Therefore, Java created a new structure to be able to remove some elements from a Collection or modify a collection
        The new structure is called "Iterators"
        There are 2 iterators   i)Iterator: has one direction, from right to left.Iterator is just for removing element/s.
                                ii)List Iterator:(bidirective) has two directions from right to left and from left to right.
                                   List Iterator can be used to update as well
                                   List Iterator is rich in methods
         Note: For-each-loop and Iterator both have same performance but Iterators are the best to remove elements or to modify elements in a Collection

         set() ==> uses iterators in the backend
         remove() ==> does not

         Note: The previousIndex() method of ListIterator interface is used to return the index of the given element
               which is returned by a call to previous.
               The method returns -1 if and only if the iterator is placed at the beginning of the list.

         Note: The nextIndex() method of ListIterator interface is used to return the index of the given element which is returned by a call to next.
               The method returns -1 if and only if the iterator is placed at the end of the list.

         Note:  By using "Iterator", we can perform both read and remove operations.
                Iterator can traverse only in forward direction.
                Indexes cannot be obtained by using Iterator.
                Iterator cannot add any element into a collection

         Note:  ListIterator can traverse elements present in Collection both in forward and backward directions.
                ListIterator can be used just for Lists.
                We can modify or replace elements with the help of set() method.
                Certain methods of ListIterator are next(), previous(), hasNext(), hasPrevious(), add(), set(), nextIndex(), previousIndex().

         */

        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println(list1);//[Ali, Can, Aliye]


        //Example 01: Update every element by putting "!" to the end

        //1.Way: for-each-loop couldn't update the Collection without using set() method (Set method uses Iterator behind)
        for(String w : list1) {

          list1.set(list1.indexOf(w), w + "!");   //( w = w + "!" ) ==> This code will change nothing
                                                  //to be able to update elements we should use set() method
        }
        System.out.println(list1);



        //2.Way: By Using ListIterator
        ListIterator<String> itr = list1.listIterator(); //Using ListIterator

        while(itr.hasNext()){                             //gives direction

            String el = itr.next();                       //captures the element
            itr.set(el + "*");                            //does the action
        }
        System.out.println(list1);



        //remove all elements
        while(itr.hasNext()){
            String el = itr.next();
            itr.remove();
        }
        System.out.println(list1);  // Nothing will be removed because after updating elements pointer is at the end - after "Aliye*"
                                    //There is no element after Aliye
                                    //[Ali!*, Can!*, Aliye!*]


        //to remove elements after updating them ==> hasPrevious()
        while(itr.hasPrevious()){
            String el = itr.previous();
            itr.remove();
        }
        System.out.println(list1);

        System.out.println();



        //Example: Remove all elements by using iterator
        //Note: There is no Iterator behind remove() method; therefore, we cannot remove anything by using remove()
        //to be able to remove something from the ArrayList we need to use Iterator

//       Iterator<String> itr1 = list1.iterator();    //Using Iterator
//        while(itr1.hasNext()) {
//
//            String el = itr1.next();
//            itr1.remove();
//        }
//        System.out.println(list1);




    }
}

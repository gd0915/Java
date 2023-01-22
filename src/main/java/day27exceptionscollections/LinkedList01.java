package day27exceptionscollections;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/*
        Collections are for storing multiple data in the same data type.
        Collections are flexible in terms of the length.
        Collections have many useful methods.
        Collection ==>Interface

        There are 3 main Collections: i)List(Interface) ==> a)ArrayList: Successful in "search operations" but not good at "adding" and "removing"
                                                            b)LinkedList: Successful in "adding" and "removing" not good at "search operations"
                                                                            (put the elements into the insertion order)
                              ii)Queue(Interface) ==> a)PriorityQueue  b)Deque
                              iii)Set(Interface) ==> a)HashSet  b)LinkedHashSet  c)TreeSet

 */
public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> visitors = new LinkedList<>();//LinkedList is a concrete class; therefore, it has constructor.
                                                         // List is an interface; therefore, it does not have constructor.

        Collection<String> visitors2 = new LinkedList<>();

        //Collection, and Object can be also data type while we are typing LinkedList because they are the parent classes of LinkedList class,
        // and the data type can be the child class or parent class data type(class name can be data type)

        visitors.add("Tom");
        visitors.add("Jane");
        visitors.add("Mary");
        visitors.add("Carl");
        visitors.add("Ali");

        System.out.println(visitors);// [Tom, Jane, Mary, Carl, Ali]
                                     // Visibility/appearance is same with ArrayList, but data type is different

        visitors.addLast("Mahmut"); // It will add "Mahmut" "to the end" faster because there is a specific method for that
        System.out.println(visitors);// [Tom, Jane, Mary, Carl, Ali, Mahmut]

        visitors.addFirst("Chris");// It will add "Chris" "to the beginning"
        System.out.println(visitors);// [Chris, Tom, Jane, Mary, Carl, Ali, Mahmut]


        LinkedList<String> kids = new LinkedList<>();
        kids.add("Abc");
        kids.add("Xyz");

        visitors.addAll(kids);  //adAll() method will add the nodes "to the end" as well
        System.out.println(visitors);//[Chris, Tom, Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.add(2, "Miami"); // Normally LinkedList does not use "indexes", Java displays it as index to make usage easy for developers
                                               // Java converts the index to pointer. To make usage easier for developers we use index here.
        System.out.println(visitors); // [Chris, Tom, Miami, Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.addAll(6, kids); // It will add a LinkedList into another at specific index/node
        System.out.println(visitors);// [Chris, Tom, Miami, Jane, Mary, Carl, Abc, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove(2); /// It will remove "Miami"
        System.out.println(visitors); // [Chris, Tom, Jane, Mary, Carl, Abc, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove("Abc");// remove() method removes the "first occurrence" of the object
        System.out.println(visitors);// [Chris, Tom, Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.removeFirst();// It will remove first node
        System.out.println(visitors);// [Tom, Jane, Mary, Carl, Xyz, Ali, Mahmut, Abc, Xyz]

        visitors.remove(); //it will remove first node ( same functionality with "removeFirst()" )

        visitors.removeFirstOccurrence("Xyz"); //It will remove the first occurrence
        System.out.println(visitors);// [Tom, Jane, Mary, Carl, Ali, Mahmut, Abc, Xyz]

        visitors.removeLast();  //It will remove the last node
        System.out.println(visitors);// [Tom, Jane, Mary, Carl, Ali, Mahmut, Abc]

        //Example 1: Change all names start with "A" to "*****"

        for(String w : visitors){

            if(w.startsWith("A")){
                visitors.set(visitors.indexOf(w), "*****");
            }
        }
        System.out.println(visitors); //[Tom, Jane, Mary, Carl, *****, Mahmut, *****]

        //Example 2: If the number of characters is more than 4, remove them from the LinkedList
                    //Interview Question

        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Jane");
        names.add("Mary");
        names.add("Mahmut");
        names.add("Ali");
        names.add("Emily");

        for(int i =0; i<names.size(); i++){

            if(names.get(i).length()>4){
                names.remove(names.get(i));
                i--;                    // while removing one element we should decrease the index
                                        // since the indexes will change after every iteration
            }
        }
        System.out.println(names); //[Tom, Jane, Mary, Ali]












    }


}

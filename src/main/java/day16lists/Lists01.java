package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

        //How to create a list(Arraylist)

        //1.Way:
        ArrayList<Integer> myList1 = new ArrayList<>();

        //2.Way:
        ArrayList<Integer> myList2 = new ArrayList<>();

        //3.Way:
        List<Integer> myList3 = new ArrayList<>();//import the list with the help of the import class option

        //How to print a list on the console
        System.out.println(myList3);// []

        //How to add elements into a list
        //Note: add() method put the elements in insertion order
        myList3.add(12);
        myList3.add(7);
        myList3.add(23);

        System.out.println(myList3);// [12, 7, 23]

        //How to add an element into a specific index
        myList3.add(1, 50);//add( integer index  integer element) method put the new element into a specific place
        System.out.println(myList3);//[12, 50, 7, 23]


        myList3.add(3, 99);
        System.out.println(myList3);//[12, 50, 7, 99, 23]

        //Note: In Lists there is no default value

        //How to join two lists; addAll() method
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);//elements in b will be added into the list a
        System.out.println(a);//[A, B, X, Y, Z] the elements in the list b will be added at the end
        System.out.println(b);//[X, Y, Z] second list did not change

        //If I want to put X,Y,Z into the index 1 addAll(int index Collection,,,)
        a.addAll(1, b);
        System.out.println(a);//[A, X, Y, Z, B, X, Y, Z]


        //How to get the number of elements in a list
        int sizeOfA = a.size();
        System.out.println(sizeOfA);// 8

        int sizeOfB = b.size();
        System.out.println(sizeOfB);// 3

        //Note: When you talk about the number of the elements in an Array use "length of the Array", for the lists use "size of the list"

        //Example 1: Type code to check if the given list is empty or not
//        //My Solution:
//        List<String> c = new ArrayList<>();
//        c.add("X");
//        c.add("Y");
//        c.add("Z");
//
//        boolean d = c.isEmpty();
//        System.out.println(d);
//
        //in Class Solution 1
        List<Character> d = new ArrayList<>();
        d.add('x');
        d.add('y');

        int sizeOfD = d.size();

        if(sizeOfD ==0){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }

        //in Class Solution 2: isEmpty() returns true if the list has no any element
                               //isEmpty() returns false is the list has at least one element

        boolean isEmpty = d.isEmpty();

        if(isEmpty){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");
        }

        //Note: If Java has a method for a specific functionality using the method is preferable

        //Example 2: Type code to check if the list does not have any element different from space or the list does not have any element

        //to be able to use removeAll() method you need another list, therefore we created a list contains space character
        List<String> e = new ArrayList<>();
        e.add(" ");

        //removeAll() method is used to remove multiple elements from a list
        //When you use removeAll() method, you will need a list stores the elements you want to remove

        List<String> f = new ArrayList<>();
        f.add(" ");
        f.add("a");

       f.removeAll(e);

        System.out.println(f);// [a]

        if(f.isEmpty()){
            System.out.println("The list is empty or has just space character");
        }else{
            System.out.println("The list has character/s different from space");
        } //The list has character/s different from space









    }
}

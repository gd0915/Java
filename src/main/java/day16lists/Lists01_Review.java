package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01_Review {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        System.out.println(myList);//[] no default value

        myList.add(3);
        myList.add(9);
        myList.add(12);
        myList.add(15);
        System.out.println(myList);//[3, 9, 12, 15]

        myList.add(1,50);
        System.out.println(myList);//[3, 50, 9, 12, 15]
        myList.add(4,90);
        System.out.println(myList);//[3, 50, 9, 12, 90, 15]

        //Join two lists together
        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);
        System.out.println(a);//[A, B, X, Y, Z]
        System.out.println(b);//[X, Y, Z]

        a.addAll(1,b);
        System.out.println(a);//[A, X, Y, Z, B, X, Y, Z]

        //How to get the number of elements in a list
        int sizeOfA = a.size();
        System.out.println(sizeOfA);//8

        //Example 1: Type code to check if the given list is empty or not
        List<Character> d = new ArrayList<>();
        d.add('x');
        d.add('y');

        boolean isEmpty = d.isEmpty();
        if(isEmpty){
            System.out.println("The list is empty");
        }else{
            System.out.println("The list is not empty");  //The list is not empty
        }

        //Example 2: Type code to check if the list does not have any element different from space or the list does not have any element

        List<String> f = new ArrayList<>();
        f.add(" ");
        f.add("a");

        List<String> g = new ArrayList<>();
        g.add(" ");

        f.removeAll(g);
        System.out.println(f);// [a]

        if(f.isEmpty()){
            System.out.println("The list is empty or has just space character");
        }else{
            System.out.println("The list has character/s different from space");//The list has character/s different from space
        }

















    }
}

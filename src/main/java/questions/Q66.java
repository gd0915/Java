package questions;

import java.util.ArrayList;

public class Q66 {
/*
    Part1:    Create an arraylist of Strings ==>  add - "Red", "Green", "Blue", "Yellow" and "Black" inside
              print out all the elements, each element on new line

    Part2:    Create a method that accepts a String arraylist and a String as parameters
              method should add the element at the first index of arraylist

    Part3:    Create a method that accepts a String arraylist and a String as parameters
              it should add element before last element    ex:  [1, 2, 3]  -> [1, 2, 4, 3]
 */

    public static void main(String[] args) {

        ArrayList<String> l = new ArrayList<>();
        l.add("Red");
        l.add("Green");
        l.add("Blue");
        l.add("Yellow");
        l.add("Black");

       for(String w : l){
           System.out.println(w);
       }

       addElement(l, "Purple");//[Purple, Red, Green, Blue, Yellow, Black]
       addElement02(l, "White");//[Purple, Red, Green, Blue, Yellow, White, Black]


    }

    public static void addElement(ArrayList<String> list,  String str){
        list.add(0, str);
        System.out.println(list);
    }

    public static void addElement02(ArrayList<String> list,  String str) {
        list.add(list.size() - 1, str);
        System.out.println(list);
    }

}

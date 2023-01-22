package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {

    public static void main(String[] args) {

        //Example 1: Type code to remove the first occurrence of a specific element from a String  list
        //          ["Shoes", "TV", "Radio", "LapTop", "Shoes", "Book", "Shoes"]

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("LapTop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);//[Shoes, TV, Radio, LapTop, Shoes, Book, Shoes]

        //remove() object
        a.remove("Shoes"); // first shoes will be removed
        System.out.println(a);//[TV, Radio, LapTop, Shoes, Book, Shoes]

        //use removeAll() to be able to remove all "Shoes"
        List<String> b = new ArrayList<>();
        b.add("Shoes");

        a.removeAll(b);
        System.out.println(a);

        //Example 3: Type code to remove an element at a specific index
        //        ["Shoes", "TV", "Radio", "LapTop", "Shoes", "Book", "Shoes"] remove the 5th element

        List<String> c = new ArrayList<>();
        c.add("Shoes");
        c.add("TV");
        c.add("Radio");
        c.add("LapTop");
        c.add("Shoes");
        c.add("Book");
        c.add("Shoes");

        c.remove(4);

        System.out.println(c);//[Shoes, TV, Radio, LapTop, Book, Shoes]

        //Example 4 : Create an integer list and remove the 4th elements ===>remove() integer parameter

        List<Integer> d = new ArrayList<>();
        d.add(12);
        d.add(4);
        d.add(13);
        d.add(25);
        d.add(432);
        System.out.println(d);//[12, 4, 13, 25, 432]

        d.remove(3);
        System.out.println(d);//[12, 4, 13, 432]

        //Example 5: Create an  Integer list, then remove the first occurrence of 4 ==> valueOf()
        List<Integer> e = new ArrayList<>();
        e.add(12);
        e.add(4);
        e.add(13);
        e.add(25);
        e.add(432);
        System.out.println(e);

        e.remove(Integer.valueOf(4));
        System.out.println(e);

        //Note: If you use Integer List element directly inside the remove() method like remove(4), Java will accept it as index,
        //      Because indexes are primitive integers, when you put 4, it will be accepted as primitive, and it will be an index.
        //      Lists use non-primitives as list elements, therefore you have to converts primitive int to Integer
        //      To do that, use valueOf() method from Integer wrapper class

        //Note: You will see "valueOf()" method in many classes.
        //      "valueOf()" method changes the data type without changing the value

        //Example 6 : Type code to check if a specific element exists in the list or not  ==> contains()

        List<Double> g = new ArrayList<>();
        g.add(12.99);
        g.add(5.02);
        g.add(11.23);

        boolean isExists = g.contains(5.02);
        System.out.println(isExists);//true

        //Example 7: Type code to change the elements at index 1 to 9.99   ==> set() method

        List<Double> h = new ArrayList<>();
        h.add(12.99);
        h.add(5.02);
        h.add(11.23);
        System.out.println(h);//[12.99, 5.02, 11.23]

        h.set(1, 9.99);
        System.out.println(h);//[12.99, 9.99, 11.23]

        //Example 8: Type code to increase all salaries 10% in an Integer List
        //      [5000, 6000, 4500, 3900, 7200]
        List<Double> k = new ArrayList<>();
        k.add(5000.0);
        k.add(6000.0);
        k.add(4500.0);
        k.add(3900.0);
        k.add(7200.0);
        System.out.println(k);//[5000.0, 6000.0, 4500.0, 3900.0, 7200.0]

        int idx = 0;
        for(int i = 0 ; i<k.size(); i++){

            k.set(i, k.get(i)*1.1);                      // get() method gives you the element

        }
        System.out.println(k);//[5500.0, 6600.000000000001, 4950.0, 4290.0, 7920.000000000001]

        //How to check if two lists are same or not
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //equals() method checks if the same elements are in the same position
        //If same elements are in the same position, equals() methods returns true, otherwise it returns false
        if(m.equals(n)){
            System.out.println("The lists are same ");
        }else{
            System.out.println("The lists are not same");
        }

        //How to check if a list contains multiple elements
        //[12 ,23, 32, 14, 24, 56] ==> Check if the list has 23, 56, and 24

        List<Integer> p = new ArrayList<>();
        p.add(12);
        p.add(23);
        p.add(32);
        p.add(14);
        p.add(24);
        p.add(56);

        List<Integer> q = new ArrayList<>();
        q.add(23);
        q.add(56);
        q.add(24);

        //containsAll() returns "true" if all elements exist, anyone of them does not exist, it returns "false"
        boolean areExists = p.containsAll(q);
        System.out.println(areExists);//true
                                      //If anyone does not exist, it will return false


        













    }
}

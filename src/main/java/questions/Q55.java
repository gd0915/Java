package questions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class Q55 {

    // Make a LinkedList with the names of these programs. { PHP, SQL, HTML, C++, Java}
    // And print them on the console like that : 1a) PHP 2b) SQL 3c) HTML 4d) C++ 5e) Java

    public static void main(String[] args) {

        LinkedList<String> myList = new LinkedList<>();
        myList.add("PHP");
        myList.add("SQL");
        myList.add("HTML");
        myList.add("C++");
        myList.add("Java");


        int idx =1;
        char ch = 'a';
        for(String w : myList){
           System.out.print(idx+ "" + ch +") " + w + " ");
           idx++;
           ch++;
        }











    }

}

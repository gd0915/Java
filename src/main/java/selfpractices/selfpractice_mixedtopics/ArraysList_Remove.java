package selfpractices.selfpractice_mixedtopics;

import java.util.ArrayList;

public class ArraysList_Remove {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list.remove(2));
        System.out.println(list.remove("C"));
    }
}

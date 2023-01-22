package selfpractices.selfpractice_maps;

import java.util.HashMap;

public class Q04 {

    public static void main(String[] args) {

        // Q04: update value of "a" key to "20"

        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("a",30);
        myMap.put("b",10);
        myMap.put("c",60);
        myMap.put("d",50);
        myMap.put("e",40);

        myMap.putIfAbsent("f", 20);

        System.out.println(myMap);

        // Q05: find number of entries

        System.out.println(myMap.entrySet().size());


    }

}

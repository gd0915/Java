package selfpractices.selfpractice_maps;

import java.util.HashMap;

public class Q03 {

    public static void main(String[] args) {

        // Q03: find number of entries

        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("a",30);
        myMap.put("b",10);
        myMap.put("c",60);
        myMap.put("d",50);
        myMap.put("e",40);


        System.out.println(myMap.entrySet());
        System.out.println(myMap.entrySet().size());

    }

}

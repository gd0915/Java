package selfpractices.selfpractice_maps;

import java.util.Collection;
import java.util.HashMap;

public class Q02 {

    public static void main(String[] args) {

        // Q02: type a method to find sum of values in hashmap

        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("a",30);
        myMap.put("b",10);
        myMap.put("c",60);
        myMap.put("d",50);
        myMap.put("e",40);

        sumOfValues(myMap);
        sumOfValues02(myMap);
    }

    public static void sumOfValues(HashMap<String, Integer> myMap){
        int sum = 0;
        for(int w : myMap.values()){
            sum += w;
        }
        System.out.println(sum);
    }
    public static void sumOfValues02(HashMap<String, Integer> myMap){
        Collection<Integer> c =  myMap.values();
        int sum = 0;
        for(Integer w : c){
            sum += w;
        }
        System.out.println(sum);
    }
}

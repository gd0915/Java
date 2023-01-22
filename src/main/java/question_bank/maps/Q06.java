package question_bank.maps;

import java.util.*;

public class Q06 {

    // How to check the number of repeated elements in a List

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);


        Map<Integer, Integer> myMap = new HashMap<>();

        for(Integer w : myList){

            Integer numOfOccurrence = myMap.get(w);

            if(numOfOccurrence == null){
                myMap.put(w, 1);
            }else{
                myMap.put(w, numOfOccurrence + 1);
            }
        }
        System.out.println(myMap);

        Collection<Integer> myValues = myMap.values();
        Integer counter =0;
        for(Integer w : myValues){
            if(w>1){
                counter++;
            }
        }
        System.out.println("There are " + counter + " repeated elements");













    }
}

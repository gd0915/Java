package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q90 {

    // a-Verilen arraydeki tekrarli elemanlari silip, arrayin son halini ekrana yazdirin
    // b-Arrayin son halini [3,7,6,12] haline getirin. (elemanlarin yeri farkli olabilir)

    public static void main(String[] args) {

        int [] arr = { 1, 1, 2, 3, 5, 5, 9};

        List<Integer> myList = Arrays.asList(1, 1, 2, 3, 5, 5, 9);

        //1.Way
//        HashSet<Integer> mySet = new HashSet<>(myList);
//        System.out.println(mySet);//[1, 2, 3, 5, 9]

        //2.Way:
        List<Integer> updated = new ArrayList<>();
      for(int i =0; i<myList.size(); i++){

          if(myList.indexOf(myList.get(i)) == myList.lastIndexOf(myList.get(i))){

              updated.add(myList.get(i));
          }else{
              if(!updated.contains(myList.get(i))){
                  updated.add(myList.get(i));
              }
          }
      }
        System.out.println(updated);// [1, 2, 3, 5, 9]
















    }
}

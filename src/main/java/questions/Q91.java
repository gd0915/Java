package questions;

import java.util.*;

public class Q91 {

    public static void main(String[] args) {

        //HashSet kullanarak bu listeyi elde ediniz-->[4, 7, java güzeldir, 11]
        //Ardindan elemanlari [5, Java Super, true, x, [4, 7, java güzeldir, 11]] olan bir Arraylist olusturalim

        Set<Object> s1 = new HashSet<>(Arrays.asList(4,"java guzeldir", 11, 7));

        System.out.println(s1); // [4, 7, 11]

        s1.add("java guzeldir");



        System.out.println(s1); // [4, 7, java güzeldir, 11]

        List<Object> list =new ArrayList<>(Arrays.asList(5,"Java Super",true,'x',s1));


        System.out.println(list );
    }
}

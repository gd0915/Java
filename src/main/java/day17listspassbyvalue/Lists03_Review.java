package day17listspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class Lists03_Review {

    public static void main(String[] args) {

        //Example 1 : Increase the value of every element by 3 except 7

        List<Integer> a = new ArrayList<>();
        a.add(22);
        a.add(12);
        a.add(7);
        a.add(37);
        a.add(45);
        a.add(61);
        System.out.println(a);//[22, 12, 7, 37, 45, 61]

        for(Integer w : a){
            if(!w.equals(7)){
                a.set(a.indexOf(w), w+3);
            }
        }
        System.out.println(a);//[25, 15, 7, 40, 48, 64]


        //Example 2: Convert all elements to "*" except the last 4 elements

        List<String> b = new ArrayList<>();
        b.add("11");
        b.add("31");
        b.add("22");
        b.add("17");
        b.add("15");
        b.add("34");
        b.add("21");
        b.add("67");
        System.out.println(b);//[11, 31, 22, 17, 15, 34, 21, 67]

        for(int i = 0; i<b.size(); i++){
            if(i== b.size()-4 || b.size()<5){
               break;
            }
            b.set(i, "*");
        }
        System.out.println(b);


    }
}

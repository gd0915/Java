package question_bank.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists_Q04 {

    //Check if elements are in descending order in a list

    public static void main(String[] args) {

        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");

        List<String> f = new ArrayList<>();
        f.addAll(e);
        System.out.println(e);
        Collections.sort(f);
        System.out.println(e);//[Yellow, Red, Green, Blue]
        System.out.println(f);//[Blue, Green, Red, Yellow]


        int size = e.size();//4
        int flag = 0;
        for(int i=0; i<size; i++){
            if(f.get(i).equals(e.get(size-1-i))){
                flag++;
            }
        }
        if(flag == size){
            System.out.println("It is in descending order");
        }else{
            System.out.println("It is not in descending order");
        }













    }
}

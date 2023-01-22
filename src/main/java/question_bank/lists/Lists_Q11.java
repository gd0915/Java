package question_bank.lists;

import java.util.ArrayList;
import java.util.List;

public class Lists_Q11 {

    public static void main(String[] args) {

        //Check if all elements are unique in an integer List by using loops.

        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(31);
        a.add(15);
        a.add(7);
        a.add(15);
        a.add(23);

        int counter = 0;

        for(Integer w : a){
            if(a.indexOf(w)!=a.lastIndexOf(w)) {
                counter++;
            }
        }
        if(counter>0){
            System.out.println("There is at least one repeated element");
        }else{
            System.out.println("All elements are unique");
        }







    }
}

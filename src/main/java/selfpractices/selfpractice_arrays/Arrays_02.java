package selfpractices.selfpractice_arrays;

import java.util.ArrayList;
import java.util.List;

public class Arrays_02 {

    /*
      //Example 2:
        /*
         * Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */

    public static void main(String[] args) {

        String arr [] = {"John","Brad","Angel","Sofia","Emily"};
        String brr [] = {"Sofia","Brad","Grace","Emily", "Hazel"};


        for(String w : arr){
            for(String u : brr){
                if(w.equalsIgnoreCase(u)){
                    System.out.print(w.toLowerCase() + " ");
                }
            }
        }





    }
}

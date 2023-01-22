package day14arrayforeachloop;

import java.util.Arrays;

public class Arrays03_Review {

    public static void main(String[] args) {

        //Example 1:Type code to check if a specific element exists in an Array or not

             String str [] = {"Ali", "Tom", "Carl", "Angie", "Carl"};

        //1.Way:
             int counter = 0;
             String element = "Angie";

             for(String w : str){

                 if(w.equals(element)){
                     counter++;
                 }
             }
             if(counter>0){
                 System.out.println(element + " exists");
             }else{
                 System.out.println("Does not exist");
             }

        //2.Way: binarySearch()

             Arrays.sort(str);
             System.out.println(Arrays.toString(str));//[Ali, Angie, Carl, Tom]
             int idx = Arrays.binarySearch(str, "Carl");
             System.out.println(idx);//2 ==>So that means this String exists in our Array in the second index


















    }
}

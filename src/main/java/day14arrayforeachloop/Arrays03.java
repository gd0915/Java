package day14arrayforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

       //Example 1:Type code to check if a specific element exists in an Array or not

        String str [] = {"Ali", "Tom", "Carl", "Angie", "Carl"};

        //1.Way:

        int count = 0 ;
        String name = "Tom";

        for(String w : str){
            if(w.equals(name)){
                count++;
            }

        }
        if(count>0){
            System.out.println("It exists");
        }else{
            System.out.println("It does not exist");
        }


        //2.Way: We will use binarySearch() method
        //       i)If the element exists binarySearch() method returns the index of the element

        Arrays.sort(str); //We have to first put the elements in ascending order by using sort method
        System.out.println(Arrays.toString(str));//[Ali, Angie, Carl, Tom]

        int idx = Arrays.binarySearch(str, "Carl");
        System.out.println(idx);//If the index is zero or more, it means the element exists

        int idxMiami = Arrays.binarySearch(str, "Miami");
        System.out.println(idxMiami);// -4 ==> "-" means does not exist
                                     //        "4" means if it would exist in the Array, it would be the 4th element




    }
}

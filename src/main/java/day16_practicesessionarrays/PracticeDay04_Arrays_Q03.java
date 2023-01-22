package day16_practicesessionarrays;

import java.util.Arrays;

public class PracticeDay04_Arrays_Q03 {


    public static void main(String[] args) {

        //Example 1:Type code to check if a specific element exists in an Array or not

        int arrInt [] = {250, 85, 98, 25, 88, 654, 789};
        int counter = 0;
        int element= 250;

        for(int w : arrInt){    //==> for int i=0; i<length.arrInt; i++
            if(w==element){
                counter++;
            }
        }
        if(counter>0){
            System.out.println("The element exists");
        }else{
            System.out.println("Does not exist");
        }

        //Example 2 : Type code to check if a specific element exists in an Array or not

                //1.way:
                String str[]= {"Ellie", "Susan", "Michael", "George", "Tom"};

                String name= "George";

                int counter1=0;

                for (String w: str){
                    if(w.equals(name)){
                        counter++;
                    }
                }
                if (counter>0){
                    System.out.println(name + " exists in the array");
                }else{
                    System.out.println(name+ " does not exist in the array");
                }

                //2.way: We will use binarySearch().
                //If the element exists binarySearch() method returns the index of the element.
                //When we need to use binarySearch(), we have to sort the array first and then use binarySearch().

                Arrays.sort(str);
                System.out.println(Arrays.toString(str));

                int idx= Arrays.binarySearch(str, "George");

                System.out.println(idx);

                int idxAli= Arrays.binarySearch(str, "Sally");

                System.out.println(idxAli);





    }



}

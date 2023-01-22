package questions_ppt;

public class Lists_ForEachLoop_Slide157_Q03 {

    public static void main(String[] args) {

        //Write a Java program to find the common elements between two arrays (string values).

        String arr [] = {"Ali", "Emily", "Tom", "Ricky", "John"};
        String brr [] = {"Justin", "Ali", "Lucy", "Tom", "Emily", "John"};

        for(String w : arr){

            for(String u : brr){

                if(w.equalsIgnoreCase(u)){
                    System.out.print(w + " ");//Ali Emily Tom John
                }
            }
        }





    }
}

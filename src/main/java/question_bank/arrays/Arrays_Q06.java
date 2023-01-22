package question_bank.arrays;

public class Arrays_Q06 {

    public static void main(String[] args) {

        /*
            Count how many words start with 'a' or 'A' in a given String
         */

        String str = "Apex is an object oriented programming language";

        String arr []= str.split(" ");

        int count = 0;

        for(String w : arr){

            if(w.startsWith("a") || w.startsWith("A")){
                count++;
            }
        }
        System.out.println(count);








    }
}

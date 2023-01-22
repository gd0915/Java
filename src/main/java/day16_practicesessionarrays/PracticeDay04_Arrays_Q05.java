package day16_practicesessionarrays;

public class PracticeDay04_Arrays_Q05 {

    public static void main(String[] args) {

        //Example 3: Count the number of words starts with "s" in the String
        String strArr [] = {"Learn", "Java", "earn", "money"};

        int counter= 0;
        for(String w : strArr){
            if(w.startsWith("s") || w.startsWith("S")){
                counter++;
            }
        }
        System.out.println(counter + " words are in the sentence");

        if(counter==0){
            System.out.println("There is not a word in that sentence");
        }









    }
}

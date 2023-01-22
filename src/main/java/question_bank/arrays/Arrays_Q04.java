package question_bank.arrays;

public class Arrays_Q04 {

    public static void main(String[] args) {

        /*
            Get the initials of the elements in a String array, if the String ends with 'n' or 'k'
            Example: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Output is JJM
         */

        String a [] = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};

        String initialsOfNames = "";

        for(String w : a){
            if(w.endsWith("n") || w.endsWith("k")){
                initialsOfNames = initialsOfNames + w.substring(0,1);
            }
        }
        System.out.println(initialsOfNames);
    }
}

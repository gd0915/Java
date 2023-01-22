package tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        /*
        Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
        e.g:
        char ch1= 'a' ;
        String name =“John came late"
        Expected Output: Number of a = 2
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name please!");
        String name = input.nextLine();
        System.out.println("Enter a character please");
        char ch = input.next().charAt(0);
        int counter =0;
        for(int i = 0; i<name.length()-1; i++){
            if(name.charAt(i)==ch){
                counter++;
            }
        }
        System.out.println(counter);








    }
}

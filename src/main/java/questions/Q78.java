package questions;

import java.util.Scanner;

public class Q78 {

     /*
	 	Get a String and a character from user
	 	Count the number of characters between the first occurrence and the last occurrence of the given character in the String
	 	Do not count the space characters
	 	If the character which user selected is displayed just once in the String return -1
	 	If the character which user selected does not exist in the String return -1
	 	For example; "Java is easy" - 'a' ==> 3
	 	             "Java is easy" - 'w' ==> -1
	 	             "Java is easy" - 'e' ==> -1
	 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String please");
        String str = input.nextLine();

        System.out.println("Enter a character to check how many characters exist between the first and last occurrence of the character in the given String ");
        String character = input.next();

        System.out.println(str = str.replaceAll("\\s", ""));

        int counter=0;
        for(int i=0; i<str.length(); i++){

            String ch = str.substring(i, i+1);

            if(ch.equals(character)){
               counter++;
            }
        }

        if(counter<2){
            System.out.println("-1");
        }else{
            System.out.println(character + " ==> " + counter);
        }




    }
}

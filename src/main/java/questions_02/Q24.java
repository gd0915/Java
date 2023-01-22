package questions_02;

import java.util.Scanner;

public class Q24 {

    public static void main(String[] args) {

    /*
        Get a String and a character from user
           i)Count the number of characters between the first occurrence and the last occurrence of the
             given character in the String
           ii) Do not count the space characters
           iii) If the character which user selected is displayed just once in the String return -1

            For example; "Java is easy" - 'a' ==> 5
                         "Java is easy" - 'e' ==> -1
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = input.nextLine();

        System.out.println("Enter a character to check the number of characters between first and last occurrence of that number");
        char ch = input.next().charAt(0);

        int counter = 0;
        int firstOccIdx = str.indexOf(ch);
        int lastOccIdx = str.lastIndexOf(ch);

        if(str.indexOf(ch)==str.lastIndexOf(ch)){
            System.out.println(-1);
        }else{
            for(int i=firstOccIdx+1;  i<lastOccIdx; i++){
                if(str.charAt(i) != ' '){
                    counter++;
                }
            }
            System.out.println(counter );
        }


    }
}

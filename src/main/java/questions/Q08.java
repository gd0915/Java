package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q08 {

    public static void main(String[] args) {

        /*
            Create a list by getting the list elements from user
            If there is duplicated elements remove them from the list
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements you want to see in your list, and press Q to quit!");

        List<String> myList = new ArrayList<>();

        String str ="";

        while(!str.equalsIgnoreCase("Q")){

            str = scan.next();

            if(!str.equalsIgnoreCase("Q")) {
                myList.add(str);
            }
        }
        System.out.println(myList);

      List<String> myList2 = new ArrayList<String>();

        for(int i = 0; i<myList.size(); i++){

            if(!myList2.contains(myList.get(i))) {
                myList2.add(myList.get(i));
            }

        }
        System.out.println(myList2);






    }
}

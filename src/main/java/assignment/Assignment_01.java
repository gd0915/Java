package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment_01 {

    public static void main(String[] args) {

        /*
        - Type code to ask user to enter the int elements and add elements into the list
        - Ask user to enter the elements to remove, then remove that element from list.
        - Ask user to enter the element to update, then update it.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the elements you want to enter");
        int numOfElements = input.nextInt();

        List<Integer> myList = new ArrayList<>(numOfElements);

        for(int i =0; i<numOfElements; i++){
            System.out.println("Enter the " + ( i+1) + ". element to add to the list");
            int listElements = input.nextInt();
            myList.add(listElements);
        }
        System.out.println(myList);//[20, 30, 40]


        System.out.println("Enter the  element you want to remove from the list");
        int removeElement = input.nextInt();
        myList.remove(Integer.valueOf(removeElement));
        System.out.println(myList);


        for(int w: myList) {
            System.out.println("Enter an element to update the list");
            int newElementsToUpdate = input.nextInt();
            myList.set(myList.indexOf(w), newElementsToUpdate);
        }
        System.out.println(myList);









    }
}

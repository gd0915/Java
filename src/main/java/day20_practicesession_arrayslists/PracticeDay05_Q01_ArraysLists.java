package day20_practicesession_arrayslists;

import java.util.*;

public class PracticeDay05_Q01_ArraysLists {

    public static void main(String[] args) {

        // Example 1:Ask user to enter an integer and print "even" on the console for even integers, increase the value by 3
        //           for odd integers and print it on the console by using ternary.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer to check if it is even or odd");
        int i = input.nextInt();

        System.out.println(i % 2 == 0 ? "even" : i + 3);

        System.out.println("==================");

        /*
        Example 2: * Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */

        String arr [] = {"John","Brad","Angel","Sofia","Emily"};
        String brr [] = {"sofia","brad","grace", "emily", "hazel"};

        List<String> list = new ArrayList<>();

        for( String w : arr){

            for(String u : brr){

                if(w.equalsIgnoreCase(u)){
                    list.add(u);
                }
            }
        }
        System.out.println(list);

        System.out.println("===================");

        /*
        Example 3: If the list has 15 as element, change all 15s to 51
        Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
         */

        List<Integer> list1 = Arrays.asList(12, 11, 15, 34, 15,15, 15,43);

        if(list1.contains(15)) {

            for (int w : list1) {
                if (w == 15) {
                    list1.set(list1.indexOf(15), 51);
                }
            }
        }else{
                System.out.println("List does not contain the expected element");
            }

        System.out.println(list1);//[12, 11, 51, 34, 51, 51, 51, 43]


        System.out.println("======================");


        /*
        Example 4: Find the sum of the least and the greatest price given in a String List.
        Example: List<String> myList= new List<String>{"$12.99", "$8.25", "$23.60", "$54.45"}; ==> 62.70
         */
        List<String> myList= Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        List<Double> doublePrice = new ArrayList<>();
        for(String w : myList){
            double price = Double.valueOf(w.replace("$", ""));
            doublePrice.add(price);
        }
        System.out.println(doublePrice);//[12.99, 8.25, 23.6, 54.45]
        Collections.sort(doublePrice);
        System.out.println(doublePrice);//[8.25, 12.99, 23.6, 54.45]
        System.out.println("The sum of the least and the greatest price is " + (doublePrice.get(0) + doublePrice.get(myList.size() - 1)));//The sum of the least and the greatest price is 62.7


        System.out.println("=======================");

        /*
         Type code to check if a String has an Uppercase initial and dot at the end.

         For Ex: for "Ali", your code should print false on the console
              for  "ali." your code should print false on the console
              for "Ali." your code should print true on the console
              for "Ali. " your code should print false on the console
              for "ALI." your code should print true on the console
         */
        String str = "Ali.";
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);

        boolean isFirstCharUpperCase = firstChar>='A' && firstChar<='Z';
        boolean isLastCharDot = lastChar == '.';
        boolean isFirstCharUpperCaseAndLastCharDot = isFirstCharUpperCase && isLastCharDot;

        System.out.println("Is the last char upper case and last char dot? " + isFirstCharUpperCaseAndLastCharDot);//true

        /*
         Find the middle element in an integer array
         Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
         (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
         */

         int irr [] = {12, 5, 8, 10};
         Arrays.sort(irr);
         System.out.println(Arrays.toString(irr));//[5, 8, 10, 12]

              if(irr.length%2!=0){
                int midElement = irr[irr.length/2];
                  System.out.println(midElement);
              }else{
                 int midElement =  (irr[irr.length/2] + irr[irr.length/2 -1])/2;
                  System.out.println(midElement);
              }



    }
}

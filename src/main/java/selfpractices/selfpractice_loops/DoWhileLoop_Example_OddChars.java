package selfpractices.selfpractice_loops;

import java.util.Scanner;

public class DoWhileLoop_Example_OddChars {

    public static void main(String[] args) {

      /*
        Ask user to enter a String
        Print the characters whose indexes are odd on the console
        For example; Germany ==> e m n
                */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String please!");
        String str = input.next();

        String oddChars = "";

        for(int i=0; i<str.length(); i++){

            int idx = str.indexOf(str.charAt(i));
            if(idx%2!=0) {
                System.out.print(oddChars + str.charAt(i) );
            }
        }

//        //2.Way
//        Scanner input = new Scanner(System.in);
//
//        String str;
//        int i = 0;
//
//        do {
//            System.out.println("Enter a String please!");
//            str = input.nextLine();
//            String c = String.valueOf(str);
//            if (str.indexOf(c.charAt(i)%2 != 0){
//                System.out.print(str.charAt(i) + " ");
//            }
//        }while(i < str.length());


        }

    }




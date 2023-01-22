package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {

        /*
        Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
         (Kullanicidan ard arada sayi isteyecegiz, kendisi cikis yapmak isteyene kadar sayilari almaya devam edecegiz.
        En son ekrana girdigi cift sayilarin toplamini verecegiz. ardindan girdigi negatif sayilarin toplamini verecegiz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer, to quit press \"Q\" please!");

        List<String> list = new ArrayList<>();

        String strNum ="";
        int sumEven = 0;
        int sumOdd = 0;

       while(!strNum.equalsIgnoreCase("Q")) {

           strNum = scan.next();

           if (!strNum.equalsIgnoreCase("Q")) {
               list.add(strNum);
           } else {
               System.out.println("You exited!");
           }
       }
        System.out.println(list);

       for(String w : list) {
           if (Integer.valueOf(w) % 2 == 0) {
               sumEven += Integer.valueOf(w);

           }
           if (Integer.valueOf(w) % 2 != 0) {
               sumOdd += Integer.valueOf(w);

           }
       }
        System.out.println("The sum of the even numbers is " + sumEven);
        System.out.println("The sum of the odd numbers is " + sumOdd);
















    }
}

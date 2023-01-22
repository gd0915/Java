package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q81 {

         /*
        Kullanicidan alinan bir String in ilk ve son harfini yine kullanicidan alinan sayi kadar
        return eden bir method yaziniz
        ornek: input        output
               elma 2       eaea
               army 3       ayayay
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String please");
        String str = input.nextLine();
        System.out.println("Enter a number please to type a code that repeats the first and last characters f the String the given number of times ");
        int number = input.nextInt();

        //1.Way:
        System.out.println(repeatingFirstAndLastLetter(str, number));

        //2.Way
        List<String> list = new ArrayList<>(Arrays.asList(str));
        repeatingFirstAndLastLetter01(list, 3);
    }


    public static String repeatingFirstAndLastLetter(String str, int number){
        String initial = str.substring(0, 1);
        String lastCharacter = str.substring(str.length()-1);

        String result = "";
        for(int i=0; i<number; i++) {
            result += initial + lastCharacter;
        }
        return result;
    }

    public static void repeatingFirstAndLastLetter01(List<String> list, int number){
        for(int i=0; i<number; i++) {
            list.stream().map(t-> t.substring(0,1) + t.substring(t.length()-1)).forEach(System.out::print);
        }
    }





}

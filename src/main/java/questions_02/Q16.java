package questions_02;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {

        //Ask user to type a positive  Integer and type code to find the sum of the unique digits of that integer


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive Integer please!");
        String n = input.next();

        int sum = 0;

        for(int i =0 ; i<n.length(); i++){
          String digit = n.substring(i, i+1);
            if(n.indexOf(digit)==n.lastIndexOf(digit)){
                sum = sum + Integer.valueOf(digit);
            }
        }
        System.out.println(sum);



    }
}

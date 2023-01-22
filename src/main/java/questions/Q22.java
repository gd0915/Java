package questions;

import java.util.Scanner;

public class Q22 {

    public static void main(String[] args) {

        //Check number is even or odd

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a  number please!");
        int i = input.nextInt();

        if(i%2 == 0){
            System.out.println(i + " is even");
        }else{
            System.out.println(i + " is odd");
        }

        String isEven = i%2 == 0 ? "even" : "odd";
        System.out.println(isEven);






    }
}

package day10loops;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //while-loop
        //When you use while-loop zero execution is possible
        int i =1;

        while(i<1){
            System.out.println("While loop");
            i++;

        }

        //do-while loop
        //When you use do-while loop zero execution is impossible, loop body will be executed at least once
        //If it is mandatory to execute the code inside the loop body at least once, use do-while loop
        int k =1;

        do{
            System.out.println("do=while loop");
            k++;
        }while(k<1);

        System.out.println();

        /*  Example 1: Ask user to enter an integer.
              If the integer is less than 100, tell user "Won!"
              Otherwise, tell user "Lost!"
         */

        Scanner input = new Scanner(System.in);
        int num =0;

        do {
            System.out.println("Enter a number to play");
             num = input.nextInt();

            if (num < 100) {
                System.out.println("Won!");
            }

        }while(num<100);

        System.out.println("Lost!");

        //increment and decrement is done by user, so we do not need to type num++; or num--; in the curly braces

        System.out.println();


        //infinite loops
        //Note: If you do mistake in increment/decrement part the loop will be infinite loop.Do not create infinite loop


//        for(int p=1; p<10; p--){
//            System.out.println(p + " ");
//        }

        //Note: If you do not type increment/decrement part the loop will be infinite loop. Do not create infinite loop

//        for(int p=1; p<10; ){
//            System.out.println(p + " ");
//        }


        //If you forget to type increment/decrement part like the example below it will be infinite loop.
//        int r = 0;
//
//        while(r==0){
//            System.out.println("Hi!");
//        }

        //By putting "true" inside the while parenthesis we can create infinite loop,and we break the loop by the codes inside the loop body
        int r=0;

        while(true){
            System.out.println("Hi!");
            r++;
            if(r==5){
                break;
            }
        }







    }
}

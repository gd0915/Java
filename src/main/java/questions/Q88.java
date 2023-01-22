package questions;

import java.util.Scanner;

public class Q88 {

    //Write a program to enter the numbers till the user wants and at the end it should display the count
    // of positive, negative and zeros entered.    Output-->like that

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       int countPositive= 0;
       int countNegative=0;
       int countZero=0;
       char choice ;



        do{
            System.out.println("Enter a number please! ");
            int number = input.nextInt();

           if(number>0){
                countPositive++;
            }else if(number<0){
                countNegative++;
            }else if(number==0){
               countZero++;
            }else{
                System.out.println("Please enter a positive number");
            }
            System.out.println("Do you want to continue? Please press y/n !");
            choice = input.next().charAt(0);

        }while(choice=='y' || choice=='Y');

        System.out.println("You entered " + countPositive + " times Even number" + '\n' + "You entered " +countNegative + " times Odd number" + '\n' + "You entered "  + countZero + " times zero");


    }
}

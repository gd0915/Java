package tasks;

import java.util.Scanner;

public class Task04 {

    /*
        Ask user to their weight and height and type a program with calculates mass index
        * HINT : Body Mass Index = Weight (kg) / Square of height (m)

        Then give a message to user as following:

        If BMI is less than 18.5 , you re weak
        If BMI is between 18.5 and 25 , your weight is ideal
        If BMI is between 25 and 30, you re fat
        If BMI is more than or equal to 30, obese
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight in kg please!");
        double weight = scan.nextDouble();
        System.out.println("Enter your height in m please!");
        double height = scan.nextDouble();

        double BMI = weight/(height*height);

        if(BMI<=0){
            System.out.println("Enter a valid/positive weight and height please");
        }else if(BMI>0 && BMI<=18.5){
            System.out.println("You are weak!");
        }else if(BMI>18.5 && BMI<=25){
            System.out.println("Your weight is ideal");
        }else if(BMI>25 && BMI<=30){
            System.out.println("You are fat");
        }else if(BMI>30){
            System.out.println("In the range of obesity!");
        }else{
            System.out.println("Please check the values you entered and re-enter a valid weight and height values");
        }


    }
}

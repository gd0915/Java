package day26exceptions;

public class E01 {

    public static void main(String[] args) {

        printAge(25);//When you call a method, you use "actual values" inside the method parenthesis, they are called "arguments"

        try {
            printAge(-25);
        } catch (IllegalArgumentException e) {
            System.out.println("Age is not valid");
        }

        //If you do not want to the problem to block the coming codes we should handle/solve the issue with "try-catch block"
        try {
            printWorkerAge(14);
        } catch (IllegalArgumentException e) {
            System.out.println("Age is not valid to be worker");

        }


    }


    //Create a method to print the given age
    public static void printAge(int age){//When you create a method, you use "variables" inside the parenthesis, they are called "parameters"

        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");  // ==>IllegalArgumentException() class constructor
        }
        System.out.println(age);
    }


    //Create a method to print workers's age

    public static void printWorkerAge(int age){

        if(age<16){
            throw new IllegalArgumentException("A worker's age cannot be less than 16 "); //message optional
        }
        System.out.println(age);
    }






}

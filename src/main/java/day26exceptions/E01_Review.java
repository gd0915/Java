package day26exceptions;

public class E01_Review {

    public static void main(String[] args) {

    printAge(25);

    try{                                        //We solve the issue by using try-catch
        printAge(-25);
    }catch(IllegalArgumentException e){
        System.out.println("Age is not valid");//In the real code we will put here codes,
                                               // for example a code to take the user outside the code/
                                               // or 'ATM" machine gets the card from the user after clicking 3 times wrong password
                                               // sending message to the police department
    }
    try {
        printWorkerAge(14);
    }catch(IllegalArgumentException e){
        System.out.println("Age is not valid to be a worker");
    }


    }


    public static void printAge(int age){   //We are declaring the issue in the method below if statement

        if(age<0){
            throw new IllegalArgumentException("Age cannot be negative");//object creation from IllegalArgumentException class; Java stop execution here
        }
        System.out.println(age);
    }


    public static void printWorkerAge(int age){

        if(age<16){
            throw new IllegalArgumentException("A worker's age cannot be less than 16");
        }
        System.out.println(age);
    }





}

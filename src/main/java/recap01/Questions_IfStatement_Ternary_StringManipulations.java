package recap01;

import java.util.Scanner;

public class Questions_IfStatement_Ternary_StringManipulations {
    /*
  1)   NOTE: leap year is very common INTERVIEW question
  Type java code by using nested ternary.
  Write a program to check if a year is leap year or not.
  If the year is divisible by 100 then it must be divisible by 400.
  If a year is not divisible by 100 then it must be divisible by 4.


  /* 2) (day 4)
         Ask user to enter a password
         If the initial of the password is uppercase
         check if it is 'A' or not.
         If it is 'A' the output will be "Valid Password"
         otherwise the output will be "Invalid Password"
         For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

         If the initial of the password is lowercase
            check if it is 'z' or not.
            If it is 'z' the output will be "Valid Password"
            otherwise the output will be "Invalid Password"
         For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid

    */

    // 3)Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
    // Type code to print abbreviation of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"  (day 5)


    // 4)Create a simple calculator which does addition, subtraction, multiplication, division,
    // percentage calculation using switch (day 4)


    //5)Type a program to print the minimum of 2 doubles on the console. Use ternary. (day 5)



    //6) You have 2 integers;
    //If both of the integers are positive do multiplication
    // If one is negative the other one is positive return "I do not how to multiply" (day 5)


    // 7) Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios (day06)

    // 8) Type code to check if a character is unique in a String or not (day06)


    // 9) : Check SSN for the following rules
    //       1)it must have just digits
    //       2)it must have 9 digits

    public static void main(String[] args) {

        //Answer 01:

        int year = 1996;

        String leapYear = year%100==0 ? (year%400==0 ? "Leap year" : "Not leap year") : (year%4==0 ? "Leap year" : "Not leap");
        System.out.println(leapYear);

        //Answer 02:

        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter your password");
//        String pwd = input.next();
//
//        char initial = pwd.charAt(0);
//
//        if(initial >= 'A' && initial <= 'Z') {
//            if (initial == 'A') {
//                System.out.println("Valid Password");
//            } else {
//                System.out.println("Invalid Password");
//            }
//        }
//        else if(initial >= 'a' && initial <= 'z') {
//            if (initial == 'z') {
//                System.out.println("Valid Password");
//            } else {
//                System.out.println("Invalid Password");
//            }
//        }
//
//        //Answer 03:
//
//        System.out.println("Please enter the county name");
//        String countryName = input.next().toLowerCase();
//
//        switch(countryName){
//            case "america" :
//                System.out.println("US");
//                break;
//            case "england" :
//                System.out.println("UK");
//                break;
//            case "germany" :
//                System.out.println("D");
//                break;
//            case "turkey" :
//                System.out.println("T");
//                break;
//            case "india" :
//                System.out.println("IN");
//                break;
//            case "peru" :
//                System.out.println("PE");
//                break;
//            case "bulgaria" :
//                System.out.println("BG");
//                break;
//            case "spain" :
//                System.out.println("ES");
//                break;
//            case "albania" :
//                System.out.println("AL");
//                break;
//            case "rance" :
//                System.out.println("FR");
//                break;
//            default:
//                System.out.println("Invalid country name");
//        }
//
//        //Answer 4 :
//
//        System.out.println("Please choose the operation from \"+, -, *, / \" ");
//        char ch = input.next().charAt(0);
//        System.out.println("Enter the first number");
//        int num1 = input.nextInt();
//        System.out.println("Enter the second number");
//        int num2 = input.nextInt();
//
//
//        switch(ch){
//            case '+':
//                System.out.println(num1 + num2);
//                break;
//            case '-':
//                System.out.println(num1-num2);
//                break;
//            case '*':
//                System.out.println(num1*num2);
//                break;
//            case '/':
//                System.out.println(num1/num2);
//                break;
//            default:
//                System.out.println("Choose a valid operation");
//
//        }
//
//        //Answer 5:
//
//        System.out.println("Enter first double number");
//        double d1 = input.nextDouble();
//        System.out.println("Enter second double number");
//        double d2 = input.nextDouble();
//
//        System.out.println(d1 > d2 ? d2 : d1);
//
//        //Answer 6:
//
//        System.out.println("Enter first number");
//        int n1 = input.nextInt();
//        System.out.println("Enter second number");
//        int n2 = input.nextInt();
//
//        System.out.println((n1 > 0 && n2 > 0) ? (n1 * n2) : "I do not know how to multiply");

//        //Answer 7 :
//        System.out.println("Enter a String");
//        String str = input.next();
//        System.out.println("Enter a character to check if it exists in the given String");
//        String ch = input.next();
//
//        boolean checkToHaveA = str.contains("ch");
//
//        if(checkToHaveA){
//            System.out.println("The given String contains  " + ch);
//        }else {
//            System.out.println("The given String does not contain  " + ch);
//        }
//
//
//        //Answer 8:
//        System.out.println("Enter a String please");
//        String str = input.nextLine();
//        System.out.println("Enter a character to check if it is unique or not");
//        String ch = input.next();
//
//        if( str.indexOf(ch)==str.lastIndexOf(ch)) {
//            System.out.println("Unique");
//        }else {
//            System.out.println("Not Unique");
//        }

        //Answer 9:
        String ssn = "123456743" ;

        String ssn1=  ssn.replaceAll("\\d","");

        if( ssn1.length()==0  && ssn.length()==9){
            System.out.println("your ssn contain just digit and its length is nine");
        }else {
            System.out.println("Invalid ssn");
        }






    }
}

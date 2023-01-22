package question_bank.if_statement;

public class IfStatement_Q09 {
    /*
        Type code to create a simple calculator which does addition, subtraction, multiplication,
    and division with any 2 number
     a) When user entered 10.2 and 5 and + sign your code should print "The result is
     15.2" on the console
     b) When user entered 10 and 5 and - sign your code should print "The result is 5.0"
     on the console
     c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0"
     on the console
     d) When user entered 10 and -5 and / sign your code should print "The result is -2.0"
     on the console.
     */

    public static void main(String[] args) {

        double num1 = 10, num2 = 20;

        String operator = "/";

        if(operator.equals("+")){
            System.out.println("The result is " + (num1+num2));
        }else if(operator.equals("-")){
            System.out.println("The result is " + (num1-num2));
        }else if(operator.equals("*")){
            System.out.println("The result is " + (num1*num2));
        }else if(operator.equals("/")) {
            System.out.println("The result is " + (num1 / num2));
        }








    }
}

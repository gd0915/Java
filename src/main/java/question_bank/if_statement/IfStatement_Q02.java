package question_bank.if_statement;

public class IfStatement_Q02 {
    /*
        Type code to print
    a) "Valid Password" if the password has at least 8 characters different from space
    character
    b) "Do not use space character in password" if the password has any space
    character in any position
    c) "Invalid Password" if a and b conditions are not satisfied
    Note: Be careful about the orders of conditions in the solution
     */

    public static void main(String[] args) {


    String pwd = "A123";

    if(pwd.replaceAll("\\S","").length()>0){
        System.out.println("Do not use space character in password");
    }else if(pwd.replaceAll("\\s","").length()>=8){
        System.out.println("Valid Password");
    }else{
        System.out.println("Invalid Password");
    }






    }
}

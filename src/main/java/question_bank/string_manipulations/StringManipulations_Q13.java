package question_bank.string_manipulations;

public class StringManipulations_Q13 {
    /*
            Type code to check if a password is valid or not for the following conditions;
                 i)Password must have at least 8 characters different from space character
                ii)Password must have at least 1 symbol

         Example:
         For ‘A2b!’ your code should print false on the console
         For ‘A2b3cdef’ your code should print false on the console
         For ‘!1a23b4’ your code should print false on the console
         For ‘!1a23b4?es’ your code should print true on the console
         For ‘! a b 3 k’ your code should print false on the console
     */

    public static void main(String[] args) {

        String pwd = "123A456Z?";

        Boolean firstRule = pwd.replaceAll("\\s","").length()>7;
        Boolean secondRule = pwd.replaceAll("[A-Za-z0-9 ]","").length()>0;
        Boolean isThePwdValid = firstRule && secondRule;

        System.out.println("Is the password valid: " + isThePwdValid );













    }
}

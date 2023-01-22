package question_bank.ternary;

public class TernaryStatement_Q01 {
        /*1) Use ternary to print "Valid Password" if the password has at least 8 characters different
    from space characters.
    "Invalid Password" if the password has less than 8 characters different from space characters.

         */

    public static void main(String[] args) {

        String pwd = "a1b2c379";
        String isValid = pwd.replaceAll("\\s","").length()>7 ? "Valid Password" : "Invalid Password";
        System.out.println(isValid);













    }
}

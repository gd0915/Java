package question_bank.type_casting;

public class TernaryStatement_Q05 {
    /*
        Type code to check the password
    If it has more than 8 characters, initial should be 'i'
    If it does not have more than 8 characters initial should be 'K'
    Solve the task by using nested-ternary
     */

    public static void main(String[] args) {

        String pwd = "i12a3c791l";

        String initialPwd = pwd.length()>8 ? pwd.startsWith("i") ? "Valid" : "Invalid" : pwd.startsWith("K") ? "Valid" : "Invalid";

        System.out.println(initialPwd);

    }
}

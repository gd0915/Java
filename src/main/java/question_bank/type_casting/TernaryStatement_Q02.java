package question_bank.type_casting;

public class TernaryStatement_Q02 {
    /*
            Use ternary to print
        a) "Isosceles Triangle" if two sides of a triangle are equal in length.
        b) "Equilateral Triangle" if all sides of a triangle are equal in length.
        c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
        */

    public static void main(String[] args) {

        int a = 10, b = 10, c = 10;

        String typeOfTriangle = a==b && b==c ? "Equilateral Triangle" : a==b && b!=c || a==c && c!=b || b==c && a!=c ?
         "Isosceles Triangle" : "Neither isosceles, nor equilateral";

        System.out.println(typeOfTriangle);












    }
}

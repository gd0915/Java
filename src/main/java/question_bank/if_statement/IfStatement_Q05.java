package question_bank.if_statement;

public class IfStatement_Q05 {
    /*
        Type code to print
    a) "Isosceles Triangle" if two sides of a triangle are equal in length.
    b) "Equilateral Triangle" if all sides of a triangle are equal in length.
    c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied
     */

    public static void main(String[] args) {

        int l1 = 20;
        int l2 = 15;
        int l3 = 10;

        if(l2==l3&&l3!=l1 || l1==l3&&l3!=l2 || l1==l2&&l2!=l3){
            System.out.println("It is a Isosceles Triangle");
        }else if(l1==l2 && l2==l3){
            System.out.println("It is a Equilateral Triangle");
        }else{
            System.out.println("Neither isosceles, nor equilateral");
        }

    }
}

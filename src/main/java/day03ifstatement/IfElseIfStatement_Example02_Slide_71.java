package day03ifstatement;

public class IfElseIfStatement_Example02_Slide_71 {
    /*
                Type java code by using if-else if() statement,
        If age is less than 13 output will be “Should not work”,
        If age is greater than 65 output will be “Retired”,
        Otherwise; output will be “Should work”
     */

    public static void main(String[] args) {

        int age = 38;

        if(age<13){
            System.out.println("Should not work");
        }else if(age>65){
            System.out.println("Retired");
        }else{
            System.out.println("Should work");
        }
    }
}

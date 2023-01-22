package day03ifstatement;

public class IfElseIfStatement_Example01_Slide_71 {

    /*
    Type java code by using if-else if() statement,
    if both of the two integers are positive, output will be the sum of them.
    If both of the two integers are negative, output will be the multiplication of them.
    Otherwise, output will be “I cannot add or multiply different signed numbers”

     */

    public static void main(String[] args) {


        int i1 = -13;
        int i2 = 2;

        if (i1>=0 && i2>=0){
            System.out.println(i1 + i2);
        }else if(i1<0 && i2<0) {
            System.out.println(i1 * i2);
        }else{
            System.out.println("I cannot add or multiply different signed numbers");
        }


    }
}
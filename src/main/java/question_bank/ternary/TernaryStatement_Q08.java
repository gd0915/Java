package question_bank.ternary;

public class TernaryStatement_Q08 {

    //If the number has 3 digits, the output will be “This number has 3 digits.”
    // Otherwise, the output will be “This number has no 3 digits.”

    public static void main(String[] args) {

        //1.Way:

        int i = 799;

        String l = i<1000 && i>99 ? "This number has 3 digits" : "This number has no 3 digits";

        System.out.println(l);


        //2.Way:

        int i2 = -799;

        i2 = Math.abs(i2);

        String m = i2<1000 && i2>99 ? "This number has 3 digits" : "This number has no 3 digits";

        System.out.println(m);




    }




}

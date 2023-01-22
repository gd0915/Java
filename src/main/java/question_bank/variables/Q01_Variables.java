package question_bank.variables;

public class Q01_Variables {

    //Create double variables for the prices of any 3 items. Print the sum of the prices on the
    //console with a label

    public static void main(String[] args) {

        double shirt = 20.99;
        double pants = 32.99;
        double socks = 12.90;

        System.out.println("Total price is " + (shirt + pants + socks));

    }

    public static class Q04_Variables {
        /*
            Create a String and two Long variables. Print the sum and the multiplication of the long
            variables with the String on the console
         */

        public static void main(String[] args) {

           String str = "Tom Hanks";
           long l1 = 123456L;
           long l2 = 654321L;

            System.out.println("The sum  is " + str+(l1+l2));
            System.out.println("The multiplication is " + str+l1*l2);


        }
    }
}

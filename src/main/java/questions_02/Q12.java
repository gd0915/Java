package questions_02;

public class Q12 {

    public static void main(String[] args) {

        /*Type code to print to reverse a String
           i)by using loop
           ii)by using a method from StringBuilder Class

          String str = "Tom Hanks";  ==> "sknaH moT"

         */

        //1.Way:
        String str = "Tom Hanks";

        String reversed = "";

        for(int i = str.length()-1; i>=0; i--){
            String s = str.substring(i, i+1);
            reversed = reversed + s;
        }
        System.out.println(reversed);


        //2.Way:
        StringBuilder s = new StringBuilder("Tom Hanks");
        StringBuilder reverse = s.reverse();
        System.out.println(reverse);


    }
}

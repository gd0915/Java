package day09loops;

public class ReviewForLoop02 {

    public static void main(String[] args) {

        //Example 1: Type code to print characters except "m" in a String

        String str = "Mama";

        //1.Way
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != 'm') {
                System.out.print(ch);
            }
        }

        System.out.println();

        //2.Way:
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'm') {
                continue;
            }
            System.out.print(ch);
        }

        System.out.println();

        //Example 2: Type code to print characters before "m" in a String
        //              Luxembourg ==>

        String city = "Luxembourg";

        for(int i = 0; i<city.length(); i++ ){

            char ch = city.charAt(i);
            if(ch=='m'){
                break;
            }
            System.out.print(ch);
        }

        System.out.println();


        //Example 3:  Type code to find the sum of the unique digits in an integer
        //   For example , 1232 ==> 1+3=4


        String num = "3453";

        int sum = 0;

        for(int i = 0 ; i<num.length() ; i++) {

            String digit = num.substring(i, i + 1);

            if (num.indexOf(digit) == num.lastIndexOf(digit)) {
                sum = sum + Integer.valueOf(digit);
            }
        }
                System.out.print(sum);





    }
}
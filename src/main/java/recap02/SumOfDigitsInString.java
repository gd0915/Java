package recap02;

import java.util.Scanner;

public class SumOfDigitsInString {

    /*
            Create a method that accepts a String as parameter and finds the sum of digits in that String.
            Example:
            input : J4\/4 1$ 34$¥
            output : 16
            Hint:
            Character.isDigit()   //Wrapper class
            Integer.valueOf()
            */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String please ");
        String str = input.nextLine();

        sumOfDigits(str);


    }

    public static void sumOfDigits(String str) {

        int sum = 0;
        try {
            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                if (Character.isDigit(ch)) {
                    sum += Integer.valueOf("" + ch); //Will give the sum of digits ==>If I do not put "+" Java will throw exception
                    // by using "+" sign Java will concat ch with "" and it will give us the total of the digits
                    //sum += Integer.valueOf("" , ch); //throws NumberFormatException
                }
            }
            System.out.println("Sum of digits: " + sum);

        } catch (Exception e) {
            System.out.println("There has been an issue while summing up");
        }

    }
}

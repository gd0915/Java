package day09loops;

public class ReviewForLoop01 {

    public static void main(String[] args) {

        //Example 1: Type code to print to reverse a string   //Very Common Interview Question

        String name = "Mark";

        String reversedName= ""; //We created that container to be able to use that data later on.

        for(int i = name.length()-1 ; i >= 0 ; i--){

            char ch = name.charAt(i);
            reversedName = reversedName + ch;


        }

        System.out.print(reversedName);//kraM

        System.out.println();


        //Example 2: Find the sum of the integers from 3 to 6

        int sum = 0;//Identity element of addition  is always 0 in addition operation

        for(int i =3 ; i<7 ; i++){

            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println();


        //Example 3: Find the multiplication  of teh integers from 3 to 6

        int multiplication = 1;///Identity element of multiplication is always 1 in multiplication operation

        for(int i = 3; i<7 ; i++){

            multiplication = multiplication *i;
        }
        System.out.println(multiplication);


        System.out.println();


        //Example 4: Type code to find the sum of the digits of an Integer

        int num = 584;

        num = Math.abs(num);

        int sumOfDigits = 0;

        for(int i = num; i>0 ; i=i/10){

            sumOfDigits = sumOfDigits + i%10;

        }

        System.out.println(sumOfDigits);







    }
}

package recap01;

import java.util.Arrays;
import java.util.Scanner;

public class Questions_Coding_Loops {

    public static void main(String[] args) {
        System.out.println("===Question1===");
        /*
        Q01) Ask user to enter an integer.
          If the integer is less than 100, tell user "Won!"
          Otherwise, tell user "Lost!"
         */

        Scanner input = new Scanner(System.in);
        int number;

        do{
            System.out.println("Enter an integer please");
            number = input.nextInt();

            if(number<100){
                System.out.println(" You won!");
            }else{
                System.out.println("You lost!");
                //break;
            }

        }while(number<100);

        System.out.println("===Question2===");
        /*
            Q02) Type code to print integers from 3 to 6
         */

        for(int i=3; i<7; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("===Question3===");

        /*
        Q03) Type code to print odd integers from 12 to 67 in the same line with a space between them
         */

        for(int i=12; i<68; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("===Question4===");

        /*
        Q04) Type java code by using while loop,
             Write a program that prompts the user to input an integer.
             It should then find the sum of the digits of that number.
             123 ==> 1+2+3 = 6
         */

        System.out.println("Please enter an integer to find the sum of its digits");
        int num1 = input.nextInt();

        int sum = 0;
        while(num1>0){
            sum += num1%10;
            num1 = num1/10;
        }
        System.out.println(sum);

        System.out.println("===Question5===");
        /*
        Q05) Type java code by using while loop,
          Write a program that prompts the user to input a number.
          It should then print the multiplication table of that number.
          3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
         */

        System.out.println("Enter a number to get its multiplication table please");
        int num2 = input.nextInt();
        int i =1;
        while(i<11){
           System.out.print(num2 + " x " + i + " = " + (num2*i) + "  ");
           i++;
        }
        System.out.println();
        System.out.println("===Question6===");

        /*
        Q06)Example:Type code to get the output like
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....

         */

        for(int k= 1; k<4; k++){
            System.out.println("Week: " + k);
            for(int l = 1; l<8; l++){
                System.out.println("Day: " + l);
            }
        }
        System.out.println();
        System.out.println("===Question7===");
        /*
        Q07) Write a Java Program to Print Rectangle Star Pattern using For Loop
                ****
                ****
                ****
        Note: Get the number of the rows and the columns from user
         */
        System.out.println("Enter the number of rows");
        int rows = input.nextInt();

        for(int x = 0; x<rows; x++){

            for(int y = 0; y<rows; y++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("===Question8===");
        /*
        Q08)Example: Type code to get the output like
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5

         */
        int row = 5;

        for(int m = 1; m<=row; m++){

            for(int n = 1; n<=m; n++){
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.println("===Question9===");
        /*
        Q09)Type code to print digits just in the decimal part of the given decimal number with an asterix.
               For example; 75.4238 ⇒ *4*2*3*8
         */

        double number1 = 75.4238;
        String strNum = String.valueOf(number1);
        String arr [] = strNum.split("\\.")[1].split("");
        System.out.println(Arrays.toString(arr));

        for(int z = 0; z<arr.length; z++){

            System.out.print("*" + arr[z]);
        }
        System.out.println();
        System.out.println("===Question10===");
        /*
        Q10)
         Username is "admin", Password is "pwd123"
         Ask user to enter username and password
         User should see "Enter your username and password" message
         If user enters correct credentials, he should get "You are in your account!" message
         Otherwise, he should see "Enter your username and password" message 3 times
         After 3 times he should get "Your account is blocked" message

         */

        int counter = 0;
        do {
            System.out.println("Enter your username");
            String userName = input.next();
            System.out.println("Enter your password");
            String pwd = input.next();

            if(userName.equalsIgnoreCase("admin")&&pwd.equalsIgnoreCase("pwd123")){
                System.out.println("You are in your account");
                break;
            }

            counter++;

            if(counter==3){
                System.out.println("Your account has been blocked!");
            }

        }while(counter!=3);
        System.out.println();
        System.out.println("===Question11===");

        //Q11: 11)Type code to check if a given integer is palindrome or not
        //         Palindrome: 121 <==> 121  123321 <==> 123321 nalan <==>nalan

        int num3 = 123321;

        String s1 =  String.valueOf(num3);

        String reversedNum = "";

        for(int p=s1.length()-1; p>-1; p--){
           String ch = s1.substring(p, p+1);
           reversedNum += ch;
        }
        System.out.println(reversedNum);

        if(s1.equals(reversedNum)){
            System.out.println("The given integer is palindrome");
        }else{
            System.out.println("The given integer is not palindrome");
        }
















    }
}

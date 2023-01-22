package day02typecastingscanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerHomework01 {

    public static void main(String[] args) {

        /* Example 1: Type a program which calculates the area and the perimeter of a square
          whose side length is entered by user.
          Hint 1: Area of a square is length x length
          Hint 2: Perimeter of a square is 4x length
           */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length, please");

        double l = input.nextDouble();
        System.out.println("The area of the square is " + (l*l));//36.0
        System.out.println("The perimeter of the square is" + (4*l));//24.0

       /*
          Example 2: Type a program which calculates the cube of a number which is entered by user.
          Hint 1: Cube of a number is a x a x a
        */

        Scanner cube = new Scanner(System.in);
        System.out.println("Enter the number, please");

        double n = cube.nextDouble();
        System.out.println("The cube of the number is " + (n*n*n));//125.0

        /*
           Example 3: Type a program which calculates the area and the perimeter of a rectangle
           whose length and width are entered by user.
           Hint 1: Area of a rectangle is width x length
           Hint 2: Perimeter of a rectangle is 2x (width + length
         */

        Scanner rectangle = new Scanner(System.in);
        System.out.println("Enter The width, and length");

        double w1 = rectangle.nextDouble();
        double l1 = rectangle.nextDouble();

        System.out.println("The area of the rectangle is " + (w1*l1));//50.0
        System.out.println("The perimeter of the rectangle is " + (2 * (w1+l1)));//30.0

        /*
          Example 4: Type a program which calculates the volume of a rectangular prism
          whose length, width, and height are entered by user.
          Hint 1: Volume of a rectangular prism is width x length x height
         */

        Scanner volume = new Scanner(System.in);
        System.out.println("Enter the width, length, height");

        double w2 = rectangle.nextDouble();
        double l2 = rectangle.nextDouble();
        double h2 = rectangle.nextDouble();

        System.out.println("The volume of the rectangular prism is " + w2*l2*h2);//1200.0

        /*
           Example 5:Type a program which calculates the area and the perimeter of a circle
           whose radius is entered by user. (Use float)
           Hint 1: Take pi number as 3.14159
           Hint 2: Area of a circle is 3.14159 x radius x radius
           Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
           Hint 4: To get float, use nextFloat()
          */

        Scanner circle = new Scanner(System.in);
        System.out.println("Enter the radius, please");

        float r1 = circle.nextFloat();

        System.out.println("The area of the circle " + 3.14159*r1*r1);//4071.50064
        System.out.println("The perimeter of the circle " + 2*3.14159*r1);//226.19448

        /*
          Example 6: Type a program which calculates the perimeter of a triangle whose
          Side lengths are entered by user. (Use byte)
          Hint 1: Perimeter of a triangle is a + b + c
          Hint 4: To get byte, use nextByte()
         */

        Scanner triangle = new Scanner(System.in);
        System.out.println("Enter the lengths of the side1, side2, and side3");

        byte s1 = triangle.nextByte();
        byte s2 = triangle.nextByte();
        byte s3 = triangle.nextByte();

        System.out.println("The perimeter of the triangle " + (s1+(s2+s3)));//52

        /*
           Example 7: Type a program which converts the mile to kilometer. Mile value will be
           entered by user. (Use double)
           Hint 1: km = mile x 1.6
           Hint 2: To get double, use nextDouble(
         */

        Scanner mile = new Scanner(System.in);
        System.out.println("Enter the mile, please");

        double m1 = mile.nextDouble();
        double km1 = m1 * 1.6;

        System.out.println("The kilometers is " + km1);//288.0

        /*
          Example 8: Type a program which converts the hours to seconds. Hours value will be
          entered by user. (Use long)
          Hint 1: second = hour x 60 x 60
          Hint 2: To get long, use nextLong()
         */

        Scanner hours = new Scanner(System.in);
        System.out.println("Enter the hours, please");

        long h1 = hours.nextLong();
        long sec1 = h1*60*60;
        System.out.println("The second is " + h1*60*60);//309600

        /*
           Example 9: Type a program which asks user to enter his/her first name and last name,
           then print it on the console.
           Hint: To get String, use nextLine()
         */

        Scanner fullName = new Scanner(System.in);
        System.out.println("Enter your first name, and last name, please");

        String n1 = fullName.nextLine();
        System.out.println(n1);//Sam Braun

        /*
         Example 10: Type a program which asks user to enter his/her full name, and address
         then print them on the console like the full name should be in the first line,
         and the address will be in the second line.
         Hint: To get String, use nextLine()
         */

        Scanner fullNameAddress = new Scanner(System.in);
        System.out.println("Enter your full name, and address, please");

        String f1 = fullNameAddress.nextLine();
        String a1 = fullName.nextLine();
        System.out.println(f1);//Sam Braun
        System.out.println(a1);//90210 Beverly Hills Miami USA

        //The data that I gave the Java for the examples 6 , 5 , 10 , 5, 20, 10, 5, 36, 18, 14,20, 180, 86




    }
}

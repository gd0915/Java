package lambda_functional_programming;

import java.util.List;

public class Utils {

    public static void printElementsInTheSameLineWithSpace(Object str){

        System.out.print( str + " ");
    }

    public static boolean checkToBeEven(int x){

        return x%2==0;
    }

    public static boolean checkToBeOdd(int x){

        return x%2!=0;
    }

    public static int getSquare(int x){

        return x*x;
    }

    public static void printElementsWithAStarOnASeparateLine(Object str){

        System.out.println(str + "*");
    }

    public static int getCube(int x){

        return x*x*x;
    }

    public static double getHalf(double x){

        return x/2.0;
    }

    public static char getLastChar(String str){

        return str.charAt(str.length()-1);
    }

    public static char getFirstChar(String str){

        return str.charAt(0);
    }






}

package selfpractices.selfpractice_lambda;

import java.util.List;

public class My_Util {

    public static void printOnTheSameLine(Object o){

            System.out.print(o + " ");
    }

    public static boolean checkToBeEven(int x) {

            return   x % 2 == 0;
    }

    public static boolean checkToBeOdd(int x) {

        return   x % 2 != 0;
    }

    public static int getSquare(int x){

        return x*x;
    }

    public static int getCube(int x){

        return x*x*x;
    }

    public static Double getHalf(double x){

        return x/2;
    }
    public static char getLastCharacter(String str){

        return str.charAt(str.length()-1);
    }

    public static char getFirstCharacter(String str){

        return str.charAt(0);
    }










}

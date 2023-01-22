package day32lambdafp;

public class UtilsClass {


    public static void printInTheSameLineWithASpace(Object str){ //to be able to use this method in all data types we used data type from Object Class

        System.out.print(str + " ");
    }

    public static boolean checkToBeEven(int x){

        return x%2==0;
    }

    public static boolean checkToBeOdd(int x){

        return x%2!=0;
    }

    public static int getSquare(int x){

        return x*x; //or ==> "Math.pow(x, 2);"
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

    public static int getSumOfDigits(int x){

        int sum=0;
        while(x!=0){
            sum += x%10;
            x=x/10;
        }
        return sum;
    }




}

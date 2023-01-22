package day24_practicesession_arraysinheritancepolymorphism;

public class Q01_SumOfFirstNumWithAllNumsMultiplies {

    public static void main(String[] args) {
        //Method overloading is adding parameters to the same method
        //Int q==> How do you change the parameter of a method?  ==> Interview Qusetion
        //I can add different parameters and change the number of the parameters

        /*
       Create a method that adds given integers except the first one and multiplies the sum by the first integer.
         a*(b+c+d+f)
    */

        myMethod(7, 4,6,-7,100);//721
        myMethod(2.4,5.6,7.9,78.88);//221.712
        myMethod(3.9,89.45, 78, 25.2);//751.3349999999999

    }

    public static void myMethod(int a, int ...numbers){
        int sum =0;
        for(int w : numbers){
            sum += +w;//sum will be increased by "w".
        }
        System.out.println(sum*a);
    }

    public static void myMethod(double a, double ...numbers){
        double sum =0;
        for(double w : numbers){
            sum += +w;//sum will be increased by "w".
        }
        System.out.println(sum*a);
    }

    public static void myMethod(int a, double ...numbers){
        double sum =0;
        for(double w : numbers){
            sum += +w;//sum will be increased by "w".
        }
        System.out.println(sum*a);
    }



}

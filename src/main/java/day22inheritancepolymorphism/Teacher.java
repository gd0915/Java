package day22inheritancepolymorphism;

public class Teacher {

    /*
                            METHOD OVERLOADING ==> STATIC POLYMORPHISM
      1) If you create a method with the same name and different parameters, it means you are doing "Method Overloading"
      2) "Method Overloading" happens in a single class. Therefore, we do not need "inheritance" for "Method Overloading"
      3) To do "method Overloading"
         i)Do not change the method name
         ii) Change the parameters by changing the a)number of the parameters  b)data type of the parameters c)Places of the parameters
         Note: To use option "c" data types must be different
      4)"private" methods can be "overloaded"
      5)"final" methods can be "overloaded"
      6)"static" methods can be "overloaded"
      7) Why do we need "Method Overloading"?
        ==> Method overloading increases the readability of the program.
            This provides flexibility to programmers so that they can call the same method
            for different types of data.

      Note: Method Overloading + Method Overriding = Polymorphism

     */

    public static void main(String[] args) {

        add(3, 5.0);
        add(8);

        add(3.0, 5);//There are 2 options for auto widening there is no better option.
                          // They are completely same. Therefore, it gives compile time error when we type (3, 5) ==> fixed by typing (3.0, 5)


   }

    public static void add(int a, double b){
       System.out.println(a+b);
   }

    public static void add(double a, int b){
        System.out.println(a+b);
    }

    public static void add(int a){
        System.out.println(a);
    }

    public static void add(double a){
        System.out.println(a);
    }






}

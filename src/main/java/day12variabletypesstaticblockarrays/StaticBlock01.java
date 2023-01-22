package day12variabletypesstaticblockarrays;

    /*
        1)If you do not assign any value for "static" and "non-static" variables' Java assigns "default values" to them
        But Java does not assign default value for "local variables"

        2)Default values are "0" for numeric data types, is  "null" for String, it is "false" for boolean
     */
    /*
        Java Class Loader: Makes the class ready to use for you
            */

public class StaticBlock01 {

    /*
        1) Java Class Loader makes the classes ready to use
        2) When the classes make ready, class members are loaded according to some order.
          main method is the first to be loaded normally
        3)Sometimes we need something to be loaded before main method, for this scenario we use "static block".
          The code inside the "static block"  is executed before everything in the class, even before main method
        4)Rule: : "static" structures can work just with static class members
             Do not put "non-static" class members into static method, it will give error
        5) "Static block" can be used just with static variables because of the rule in 4th step
        6) "Static block" is used to initialize(assigning first value) "static variables"

          Note: When we create a variable inside the  main method, we do not use "static" keyword, because Java knows
                everything inside the main method is "static".
     */

    public static double pi;


    public static void main(String[] args) {
        System.out.println("This is main method");

        String name = "Ali Can";//Every variable inside the main method must be static. Java knows it
                                //If we do not put static keyword Java will assign it as static automatically
    }

    static{
        System.out.println("This is static block 1");
        pi = 3.14;//initializing pi variable
    }

    static{
        System.out.println("This is static block 1");
    }




}

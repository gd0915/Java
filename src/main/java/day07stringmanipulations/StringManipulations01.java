package day07stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        //contain() method:

        String str = "Java is easy";

        //Example 1)

        boolean isExist = str.contains("a");

        System.out.println(isExist);//true

        //contain() method will check if any character or String exists or not in a String.
        // If the character exists inside the String, contain() method will tell me "true", otherwise it will say "false".
        //So it returns to boolean.

        //Example 2)

        boolean isExist1 = str.contains("Java");

        System.out.println(isExist1);//true


        //startsWith() method: It can be used with String parameter.
                              // This method will give you boolean.

        //Example 1)

        boolean result = str.startsWith("J");//I am saying : Is the String starting with "J"?
        System.out.println(result);//true

        //Example 2)

        boolean result1 = str.startsWith("Java");//I am saying : Is the String starting with "Java"?
        System.out.println(result1);//true


        //startsWith(string prefix,int toffset):

        boolean res = str.startsWith("i",5);//Java will come to the String. I told Java skip first 5 characters.
                                                         // Java will say true because after the fifth character comes "i".
                                                         // Java will find the character coming from the fifth one.

        //If you use startsWith() method with 2 parameters, second parameter means skip the first characters.

        /*
        example 1:  Check if the given password
                    i) has upper case "A" in any position
                    ii)has "xy" at the beginning
                    iii)has W as 7th character
                    iv)has "8" characters in total
         */

        String password = "xy1AmSW?";

        //i)

        boolean firstRule = password.contains("A");

        //ii)

        boolean secondRule = password.startsWith("xy");

        //iii)

        boolean thirdRule = password.startsWith("W",6);

        //iv)

        boolean fourthRule = password.length()==8;

        System.out.println( "Is the password valid? " + (firstRule && secondRule && thirdRule && fourthRule));


        // endsWith(): can be used with single or multiple characters. It returns boolean.

        String s = "Do practice to be better";

        boolean rslt  = s.endsWith("r");
        System.out.println(rslt);//true

        boolean rslt1 = s.endsWith("better");
        System.out.println("better");//true


        //concat() method: Using String parameters and returns to String. This is the second way to do concatenation.
        //Concat() method is the same with the "+" in Java.

        String t = s.concat("!");
        System.out.println(t);//Do practice to be better!

        String t2 = s.concat("!").concat("...");//If you use multiple methods side by side, it is called "method chain"
        System.out.println(t2);//Do practice to be better!...



    }
}

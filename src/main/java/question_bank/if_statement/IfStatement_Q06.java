package question_bank.if_statement;

public class IfStatement_Q06 {
    /*
         Type code to create a converter which converts mile to km, second to hour, fahrenheit to
    celsius. Find the formulas for conversions from Google.

     a) When user entered 10 and mileToKm String, your code should print "16 km"(The
     number will be dynamic) on the console
     b) When user entered 7200 and secondsToHours String, your code should print "2
     Hours"(The number will be dynamic) on the console
     c) When user entered 83 and fahrenheitToCelsius String, your code should print
     "28.3333 celsius"(The number will be dynamic) on the console
     */

    public static void main(String[] args) {


    double mile = 2000;
    double seconds = 7600;
    double fahrenheit = 75;

    String converter = "mileToKm";

    if(converter.equals("mileToKm")){
        System.out.println(mile*1.60934);
    }else if(converter.equals("secondsToHours")){
        System.out.println((seconds/60)/60);
    }else if(converter.equals("fahrenheitToCelsius")){
            System.out.println((fahrenheit-32)*5/9);
        }






    }

}

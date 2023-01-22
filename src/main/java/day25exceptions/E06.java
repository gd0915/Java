package day25exceptions;

public class E06 {

    public static void main(String[] args) {


        //doCombo("5612", 2);//2806
        //doCombo(null, 2);//NullPointerException: str.length(); will throw NullPointerException, execution will be stopped in line 31
        //doCombo("", 2);//NumberFormatException
        //doCombo("12a", 2);//NumberFormatException : Integer.valueOf(str); will throw NumberFormatException, execution will be stopped in line 34
        //doCombo("420", 0);//ArithmeticException : intStr/num; will throw ArithmeticException, execution will be stopped in line 37

        //doCombo2(null, 2);//null
                            //Execution did not stop

        //doCombo2("12a", 2);//For input string: "12a"
                                    //Execution did not stop

        doCombo2("420", 0);//  / by zero
                                    //  Execution did not stop

    }


    //Create a method i)Find the length of The String ii)Convert the String to an integer iii)Divide the integer by a given number

    public static void doCombo(String str, int num){

            try {
                int length = str.length();
                System.out.println(length);

                int intStr = Integer.valueOf(str);
                System.out.println(intStr);

                int result = intStr / num;
                System.out.println(result);

            }catch(NullPointerException e){
                System.out.println("There is a problem in finding length");
            }catch(NumberFormatException e) {
                System.out.println("There is a problem in conversion");
            }catch(ArithmeticException e) {
                System.out.println("There is a problem in division");
            }

        System.out.println("Execution did not stop");

    }

    public static void doCombo2(String str, int num){

        try {
            int length = str.length();
            System.out.println(length);

            int intStr = Integer.valueOf(str);
            System.out.println(intStr);

            int result = intStr / num;
            System.out.println(result);
        }catch(Exception e){                  //We handled by using Exception parent class
                                              //There are parent / child relationship between the Exception class and AE, NFE, NPE classes.
                                              // And Java send the right message that is convenient for the situation
                                              //That way is the alternative way of the multiple catch blocks
            System.out.println(e.getMessage());
        }

        System.out.println("Execution did not stop");

    }



}

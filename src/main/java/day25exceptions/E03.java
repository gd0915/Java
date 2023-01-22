package day25exceptions;

public class E03 {

    public static void main(String[] args) {

     String str = "Tom Hanks";
     int r1= getNumOfChars(str);
     System.out.println(r1);//9

     int r2 = getNumOfChars("");
     System.out.println(r2);//0

     int r3 = getNumOfChars(null);
     System.out.println(r3);//NullPointerException: If you use "length()" method with "null" you will get NullPointerException

    }

    //Create a method to find the number of characters in a String

    public static int getNumOfChars(String str){

        int numOfChar = 0;

        try{
            numOfChar = str.length();
        }catch(NullPointerException e){
            System.out.println("A problem occurred in using length()");//null : Java did not put any message for the NullPointerException ==> no message from e.getMessage()
                                                                       // I should put my message here since Java does not create a message for it.
        }

        return str.length();

    }


}

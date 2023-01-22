package questions;

public class Q26 {

    public static void main(String[] args) {


        /*
            Ask user to enter the number of the day, and type in the console if it is "week day" or "weekend"
         */

        int day = 1;

        switch (day) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Week day");
                break;
            case 6 :
            case 7 :
                System.out.println("Weekend");
                break;
            default :
                System.out.println("Enter a valid day number");
                break;



        }








    }
}
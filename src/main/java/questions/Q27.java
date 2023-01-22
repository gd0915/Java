package questions;

public class Q27 {

    public static void main(String[] args) {

        //Check the given number and tell him/her if it is 2/3/4 smallest digit number

        int number = 10;

        switch(number){

            case 10:
                System.out.println("The smallest 2 digit number");
                break;
            case 100:
                System.out.println("The smallest 3 digit number");
                break;
            case 1000:
                System.out.println("The smallest 4 digit number");
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
    }
}

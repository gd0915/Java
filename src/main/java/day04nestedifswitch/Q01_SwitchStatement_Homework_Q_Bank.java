package day04nestedifswitch;

public class Q01_SwitchStatement_Homework_Q_Bank {

    /*
    Use switch statement to print
    a) "Winter" for December, January, February
    b) "Spring" for March, April, May
    c) "Summer" for June, July, August
    d) "Fall" for September, October, November
    e) "Invalid month name" for all the others
     */

    public static void main(String[] args) {


        String monthName = "September";
        monthName = monthName.toLowerCase();

        switch(monthName){

            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
            break;

            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
            break;

            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
            break;

            case "september":
            case "october":
            case "november":
                System.out.println("Autumn");
            break;

            default:
                System.out.println("Invalid month name");
            break;
        }







    }
}
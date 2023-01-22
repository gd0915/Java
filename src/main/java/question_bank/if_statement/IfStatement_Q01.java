package question_bank.if_statement;

public class IfStatement_Q01 {
    /*
        Type code to print
    a) "Winter" for December, January, February
    b) "Spring" for March, April, May
    c) "Summer" for June, July, August
    d) "Fall" for September, October, November
    e) "Invalid month name" for all the others
     */

    public static void main(String[] args) {


    String monthName = "December";
    monthName = monthName.toLowerCase();

    //1.Way:

    switch(monthName) {
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
            System.out.println("Fall");
            break;
        default:
            System.out.println("Invalid month name");
    }

    //2.Way:

        if(monthName.equals("december") || monthName.equals("january") || monthName.equals("february")){
            System.out.println("Winter");
        }else if(monthName.equals("march") || monthName.equals("april") || monthName.equals("may")){
            System.out.println("Spring");
        }else if(monthName.equals("june") || monthName.equals("july") || monthName.equals("august")){
            System.out.println("Summer");
        }else if(monthName.equals("september") || monthName.equals("october") || monthName.equals("november")){
            System.out.println("Fall");
        }else{
            System.out.println("Invalid month name");
        }


    }
}

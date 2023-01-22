package question_bank.if_statement;

public class IfStatement_Q04 {
    /*
        Type code to print the name of the month when you entered the number of the month.
        Example; For 1 output is "January", for 2 output is "February" etc.
     */

    public static void main(String[] args) {

        int numOfMonth = 10;

        //1.Way:

        switch(numOfMonth){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month name");
        }

        //2.Way

        if(numOfMonth==1){
            System.out.println("January");
        }else if(numOfMonth==2){
            System.out.println("February");
        }else if(numOfMonth==3){
            System.out.println("March");
        }else if(numOfMonth==4){
            System.out.println("April");
        }else if(numOfMonth==5){
            System.out.println("May");
        }else if(numOfMonth==6){
            System.out.println("June");
        }else if(numOfMonth==7){
            System.out.println("July");
        }else if(numOfMonth==8){
            System.out.println("August");
        }else if(numOfMonth==9){
            System.out.println("September");
        }else if(numOfMonth==10){
            System.out.println("October");
        }else if(numOfMonth==11){
            System.out.println("November");
        }else if(numOfMonth==12){
            System.out.println("December");
        }else{
            System.out.println("Invalid month name");
        }
    }
}

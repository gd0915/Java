package day18datetimeclassvarargs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Try {

    public static void main(String[] args) {

        // Pass Date Format
        //validateDateFormat("06/28/2019");

        System.out.println(isValid("yyyy/MM/dd", "2030/02/28"));

    }

    // Check the Date format to be MM/dd/yyyy
    private static boolean validateDateFormat(String date){

        // Store date format in String buffer
        StringBuffer sBuffer = new StringBuffer(date);
        String mon;
        String dd;
        String year;

        // Store the Date in String Buffer and Break down the date
        // 0,2 - Month
        // 3,5 - Date
        // 6,10 - Year
        mon = sBuffer.substring(0,2);
        dd = sBuffer.substring(3,5);
        year = sBuffer.substring(6,10);

        System.out.println("DD: "+ dd + " Mon: "+ mon + " Year: "+ year);

        // Validating Date Format for Turn In Date and Live Date to be MM/dd/yyyy using regular expression
        if(mon.matches("0[1-9]|1[0-2]") && dd.matches("0[1-9]|[12][0-9]|3[01]") && year.matches("(19|20)\\d\\d"))
        {
            System.out.println("Date Format matched.");
            return true;
        }
        else
        {
            System.out.println("Date Format didn't matched.");
            return false;
        }
    }

    public static boolean isValid(String dateFormat, String dateStr) {
        DateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }
}

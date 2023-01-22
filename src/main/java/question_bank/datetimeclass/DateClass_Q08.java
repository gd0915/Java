package question_bank.datetimeclass;

import java.time.LocalDate;
import java.time.Month;

public class DateClass_Q08 {

    public static void main(String[] args) {

        /*
           Type code to check if a given year is “Leap year” or not
        Leap Year:
        i) If a year is divisible by 100 and divisible by 400 it is called leap year. For example; 2000 is, 1900
        is not
        ii) If a year is not divisible by 100 and divisible by 4 it is called leap year. For example; 2004 is, 2007
        is not
         */

        LocalDate myDob = LocalDate.of(1981, Month.SEPTEMBER, 22);
        boolean isLeap =  myDob.isLeapYear();
        System.out.println(isLeap);//false











    }
}

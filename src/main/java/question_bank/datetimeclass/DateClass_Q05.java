package question_bank.datetimeclass;

import java.time.LocalDate;
import java.time.Month;

public class DateClass_Q05 {

    public static void main(String[] args) {

        /*
            Veli was born 3 years and 11 days after Ali.
            Ali gave you his date of birth as 24th of November 2012
            Type code to calculate Veli’s date of birth.
         */

        LocalDate dobVeli = LocalDate.of(2012, Month.NOVEMBER,24 ).plusYears(3).plusDays(11);
        System.out.println(dobVeli);//2015-12-05
    }
}

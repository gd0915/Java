package question_bank.datetimeclass;

import java.time.LocalDate;
import java.time.Month;

public class DateCLass_03 {

    public static void main(String[] args) {

        //Date of birth of Ali is 4th of June 1997. Type code to find the exact date 2 years, 3 months,
        //and 12 days after Ali's date of birth.

        LocalDate date = LocalDate.of(1997, Month.JUNE, 4).plusYears(2).plusMonths(3).plusDays(12);

        System.out.println(date);//1999-09-16











    }
}

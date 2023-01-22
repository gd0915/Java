package question_bank.datetimeclass;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateClass_02 {

    public static void main(String[] args) {

        //Type the code that finds out how many months Ali lived.
        //Date of birth of Ali is 4th of June 1997

        LocalDate currentDay = LocalDate.now();
        LocalDate dobAli = LocalDate.of(1997, Month.JUNE, 4 );
        long difference = ChronoUnit.MONTHS.between( dobAli, currentDay);
        System.out.println(difference);//303
    }
}

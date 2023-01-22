package question_bank.datetimeclass;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateClass_01 {

    public static void main(String[] args) {

        //Type the code that finds out how many days Ali lived.
        //Date of birth of Ali is 12th of May 2002

        LocalDate currentDay = LocalDate.now();
        LocalDate dobAli = LocalDate.of(2002, Month.MAY, 12 );
        long difference = ChronoUnit.DAYS.between( dobAli, currentDay);
        System.out.println(difference);//7444
    }
}

package question_bank.datetimeclass;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class DateClass_Q06 {

    public static void main(String[] args) {
        /*
            Create a Date Value for your date of birth  and create Date Value for your kid's dates of birth then
        calculate the difference in days.
         */

        LocalDate myBirthday = LocalDate.of(1981, Month.SEPTEMBER, 22);
        LocalDate dobGokhan = LocalDate.of(2009, Month.JUNE, 11);
        long difference = ChronoUnit.DAYS.between(myBirthday, dobGokhan);
        System.out.println(difference);//10124

    }
}

package question_bank.datetimeclass;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeClass_Q04 {

    public static void main(String[] args) {

        /*
        Ali was born on 5th of February 2015 at 10:15 am EST, Mark was born on 6th of March 2015
        at 12:25 pm EST. Ali remained in intensive care for 23 hours and 35 minutes. Veli remained
        in intensive care for 1 hour and 12 minutes. What is the difference in minutes between the
        times of Ali and Veli leaving the intensive care unit?
         */
        LocalDateTime dobAli = LocalDateTime.of(2015,2,15,10,15).plusHours(23).plusMinutes(35);
        LocalDateTime dobVeli = LocalDateTime.of(2015, 3, 6, 12, 25).plusHours(23).plusMinutes(35);
        long diff = ChronoUnit.MINUTES.between(dobAli, dobVeli);
        System.out.println(diff);//27490


    }
}

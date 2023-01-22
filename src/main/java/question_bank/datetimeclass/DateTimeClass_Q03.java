package question_bank.datetimeclass;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeClass_Q03 {

    public static void main(String[] args) {

        /*
            Ali was born in Istanbul on 5th of February 2015 at 10:00 am TRT, Mark was born in the USA
            on 5th of February 2015 at 12:00 pm EST. What is the difference between Ali’s birth time
            and Mark’s birth time in hours?
         */

        LocalDateTime dobAli = LocalDateTime.of(2015, 2,5,10,0 );
        LocalDateTime dobMark = LocalDateTime.of(2015,2,5,12,0);
        long difference = ChronoUnit.HOURS.between(dobMark, dobAli);
        System.out.println("The difference between Ali’s birth time and Mark’s birth time " + difference);//-2








    }
}

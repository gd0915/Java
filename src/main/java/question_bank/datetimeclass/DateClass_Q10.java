package question_bank.datetimeclass;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateClass_Q10 {

    public static void main(String[] args) {


            //Find the difference in hours for two different dates

        LocalDateTime d1 = LocalDateTime.of(2016,5,12,12,58);
        LocalDateTime d2 = LocalDateTime.of(2016, 4,9,11,39);
        long difference = ChronoUnit.HOURS.between(d2, d1);
        System.out.println(difference);//793







    }

}

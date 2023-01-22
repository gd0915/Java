package question_bank.datetimeclass;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTimeClass_Q05 {

    //Mark was born on 2/23/2018 at 3:25 PM in GMT. What is the exact date of birth time of Mark in Japan?

    public static void main(String[] args) {

        LocalTime inJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime inGMT = LocalTime.now(ZoneId.of("GMT"));
        long diff = ChronoUnit.HOURS.between(inGMT, inJapan);
        System.out.println(diff);//9
        LocalDateTime date = LocalDateTime.of(2018, 2, 23, 15, 25).minusHours(diff);
        System.out.println(date);///2018-02-23T07:25










    }
}

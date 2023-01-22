package question_bank.datetimeclass;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTimeClass_Q02 {

    public static void main(String[] args) {

        /*
        Type code to find time difference between Japan time zone and Germany time zone
         */

        LocalTime inJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime inGermany = LocalTime.now(ZoneId.of("Europe/Berlin"));
        long difference = ChronoUnit.HOURS.between(inGermany, inJapan);
        System.out.println(difference);//6
    }
}

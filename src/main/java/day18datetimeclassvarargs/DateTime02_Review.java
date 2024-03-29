package day18datetimeclassvarargs;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime02_Review {

    public static void main(String[] args) {

        //Type the code that find how many months Ali lived. Date of birth of Ali is 4th of June 1997

        LocalDate dobAli = LocalDate.of(1997, Month.JUNE,4);
        LocalDate currentDate = LocalDate.now();

        long difference = ChronoUnit.MONTHS.between(dobAli, currentDate);
        System.out.println(difference);//303

        //Example 2: Tom was born 45 years, 8 months and 5 days after 29 October 1923.
        //Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        //Type code to calculate the exact date of birth Tom Ali and Veli is the same or not.

        LocalDate dobTom = LocalDate.of(1923, Month.OCTOBER, 29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dobTom);//1969-07-04
        LocalDate dobVeli = LocalDate.of(1993, Month.SEPTEMBER, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dobVeli);//1969-07-04

        boolean isSame = dobTom.equals(dobVeli);
        System.out.println(isSame);//true

        //Example 3: Type code to find the time difference between Japan time zone and Germany time zone.

        LocalTime localTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        LocalTime localTimeInGermany = LocalTime.now(ZoneId.of("Europe/Berlin"));
        long diff = ChronoUnit.HOURS.between(localTimeInJapan, localTimeInGermany);
        System.out.println(diff);//17
    }
}

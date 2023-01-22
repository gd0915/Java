package question_bank.datetimeclass;

import java.time.LocalDate;
import java.time.Month;

public class DateClass_04 {

        /*
        Ali was born 45 years, 8 months and 5 days after 29 October 1923.
        Veli was born 24 years, 2 months and 11 days before 15 September 1993.
        Type code to calculate the exact date of birth of Ali and Veli
        Type code to check if the date of birth of Ali and Veli is the same or not.
     */

    public static void main(String[] args) {

        LocalDate dobAli = LocalDate.of(1923, Month.OCTOBER, 29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dobVeli = LocalDate.of(1993, Month.SEPTEMBER, 15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dobAli);//1969-07-04
        System.out.println(dobVeli);//1969-07-04
        boolean isSame = dobAli.isEqual(dobVeli);
        System.out.println(isSame);//true














    }
}

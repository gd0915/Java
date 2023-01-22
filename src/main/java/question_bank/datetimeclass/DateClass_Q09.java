package question_bank.datetimeclass;

import java.time.LocalDate;

public class DateClass_Q09 {

    public static void main(String[] args) {

        //Find the sum of the month numbers of two different dates

        LocalDate d1 = LocalDate.of(2022,9,15);
        LocalDate d2 = LocalDate.of(2015, 6, 21);
        System.out.println("The sum is " + (d1.getMonthValue() + d2.getMonthValue()));





    }
}

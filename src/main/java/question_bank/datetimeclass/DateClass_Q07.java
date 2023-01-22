package question_bank.datetimeclass;

import java.time.LocalDate;

public class DateClass_Q07 {

    public static void main(String[] args) {

        /*
        Get the last 2 digits of the year in current date
         */

        LocalDate currentDate = LocalDate.now();
        int year = currentDate.getYear()%100;
        System.out.println("The last 2 digits of the year is " + year);










    }
}

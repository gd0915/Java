package question_bank.datetimeclass;

import java.time.LocalTime;

public class DateTimeClass_Q01 {

    public static void main(String[] args) {

        /*
        If the hour is
        i) Between 24:00 and 05:00 then print ‘Sleeping time’ on the console
        ii) Between 08:00 and 16:00 then print ‘Working time’ on the console
        iii) Between 19:00 and 22:00 then print ‘Family time’ on the console
        iv) For the others print ‘Personal time’ on the console
         */

        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        if(hour>0 && hour<5){
            System.out.println("Sleeping time");
        }else if(hour>8 && hour<16){
            System.out.println("Working time");
        }else if(hour>19 && hour<22){
            System.out.println("Family Time");
        }else{
            System.out.println("Personal Time");
        }

    }
}

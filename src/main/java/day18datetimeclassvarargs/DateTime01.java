package day18datetimeclassvarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {

        //How to get "current date" by typing Java code
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-09-27

        //How to get "current time" by typing Java code
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//19:10:50.635661300

        //How to get "current date and time" by typing Java code
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-09-27T19:14:46.293366900

        //How to get "current date" in another country by typing Java code
        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);//2022-09-28

        //How to get "current time" in Japan by typing Java code
        LocalTime currentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentTimeInJapan);//08:24:10.204733200

        //How to get current date and time in another country by typing Java Code
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-09-28T08:20:33.680049900

        //How to go future in date
        LocalDate cd1 = LocalDate.now();//current day

        LocalDate cd1Next = cd1.plusDays(120);
        System.out.println(cd1Next);//2023-01-25

        LocalDate cd2Next = cd1.plusYears(2).plusMonths(5).plusDays(120);//Method Chain
        System.out.println(cd2Next);//2025-06-27

        //How to go past in date
        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);//2019-07-22

        //Homework: Type code to learn how to go future and past in time

        LocalTime ct1 = LocalTime.now();
        LocalTime ct1Next = ct1.plusHours(2).plusMinutes(120).plusSeconds(2500);
        System.out.println(ct1Next);
        LocalTime ct1Past = ct1.minusHours(3).minusMinutes(5).minusSeconds(120);
        System.out.println(ct1Past);


        //How to get a specific part of the time(i.g. just the hour or just the minutes)
        LocalTime ct2 = LocalTime.now();
        int hour = ct2.getHour();
        System.out.println(hour);//19

        int minute = ct2.getMinute();
        System.out.println(minute);//44

        int second = ct2.getSecond();
        System.out.println(second);//50

        //How to change the format of the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Uppercase M for months, lowercase m is for minutes
        String formattedCurrentDate = dtf.format(cd1);
        System.out.println(formattedCurrentDate);//27/09/2022

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy");//MMM gives you the first 3 chars of the month name
                                                                        // "yy" gives you the "last 2 digits" of the year
        String formattedCurrentDate2 = dt.format(cd1);
        System.out.println(formattedCurrentDate2);//27/Sep./22

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedCurrentDate3 = d.format(cd1);
        System.out.println(formattedCurrentDate3);//27/September/2022

        //How to change the format of the time
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("hh:mm a");// choose String Pattern // hh uses 12 hours system, HH uses 24 hours system

        LocalTime lt = LocalTime.now();

        String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime);//08:02 p.m.

         /*
            Enum is something like class normally in a class you have variables and methods. In Enums you may have variables and methods
            as well. but when we create enum we use it to store constant variables. Unchangeable variables. like months...
            Whenever you need Unchangeable variables use enum.
            For example, you are creating for Honda - Honda has some models like Civic HRV ...
            their names will not change anytime honda civic exists for many years.
            If you are sure they will remain same for long time.you are creating application for Honda you will use civic model many times in your application.
            You put them in enum when you need models you go to enum select it from there and use. you don't need to memorise model names.
            Go to enum and get the one you need. When you  create a value in enum you can add values?
            For example, you are working with states in the USA create an enum and put states in it. then you create method to get variables from that enum.
         */

        //How to create specific dates
        LocalDate dob1 = LocalDate.of(2012,3,13);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY, 21);

        //How to compare two dates ==> isBefore() method
        //for the quality isBefore() gives false
        //In isBefore() method if the first date is before the second date you get true
        //Otherwise(equality and first is after) you will get false
        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore);//true

        boolean is = dob2.isBefore(dob1);
        System.out.println(is);//false

        boolean isAfter = dob2.isAfter(dob1);
        System.out.println(isAfter);//true














    }
}

package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class CurrentDate {

    public static void main(String[] args) {

        System.out.println("\n----------Date class----------\n");
        Date date = new Date();
        System.out.println(date); //Sun Dec 11 11:19:03 CST 2022


        System.out.println("\n------------LocalDate class-----------\n");
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); // yyyy-MM-dd
        System.out.println(localDate.plusDays(7));
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());


        System.out.println("\n------------LocalTime class-----------\n");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 11:19:03.368 hh:mm:ss.SSS
        System.out.println(localTime.minus(2, ChronoUnit.HOURS)); // 09:30:45.683


        System.out.println("\n------------LocalDateTime class-----------\n");
        LocalDateTime localDateTime = LocalDateTime.now(); // 2022-12-11T11:22:15.583 yyy-MM-ddThh:mm:ss.SSS
        System.out.println(localDateTime);


    }
}

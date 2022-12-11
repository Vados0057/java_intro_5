package date_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterPractice {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Today's date and time is " + localDateTime + "\n");

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("EEE hh:mm a"))); // Sun 01:27 PM
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))); // 12/11/2022


    }
}

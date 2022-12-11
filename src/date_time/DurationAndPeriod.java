package date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); // 2022-12-11

        LocalDate dateOfBirth = LocalDate.of(1997, Month.JANUARY,31);

        System.out.println(today);
        System.out.println(dateOfBirth + "\n");

        System.out.println(Period.between(dateOfBirth, today).getYears()); // 29
        System.out.println(Period.between(dateOfBirth, today).getMonths());// 10
        System.out.println(Period.between(dateOfBirth, today).getDays()+ "\n");// 11

        //Using ChronoUnit


        System.out.println(ChronoUnit.YEARS.between(dateOfBirth, today)); //25
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth, today)); //310
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth, today)); //1349
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth, today) + "\n"); //9445

        LocalTime localTime1 = LocalTime.of(12, 44,15);
        LocalTime localTime2 = LocalTime.of(13, 45,45);
        System.out.println(Duration.between(localTime1, localTime2).getSeconds() /60 + "\n"); // 3690


        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2)); // 1
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2)); // 61
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2)); // 3690

    }
}

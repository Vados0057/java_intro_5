package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {

        System.out.println("\n-----------_Formatting Date_-------------\n");
        Date date = new Date();
        System.out.println(date); // Sun Dec 11 11:34:21 CST 2022   ->     EEE MMM dd hh:mm:ss z yyyy
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatter.format(date)+ "\n"); // 12/11/2022

        formatter = new SimpleDateFormat("yyyy");
        System.out.println(formatter.format(date) + "\n");

        formatter = new SimpleDateFormat("hh:mm:ss MM/dd/yyyy");
        System.out.println(formatter.format(date) + "\n");

        System.out.println(new SimpleDateFormat("hh 'o''clock' mm 'minutes' a, zzzz").format(new Date()));


    }
}

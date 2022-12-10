package exception_handling.custom_exceptions;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestPermission {
    public static void main(String[] args) {

//        int age = ScannerHelper.getAnAge();
//
//       try {
//           if (Permission.isAgeValid(age)) ;
//           System.out.println("You can get DL");
//       }catch (Exception e){
//           e.printStackTrace();
//       }finally {
//         if (age < 16) System.out.println(" You are only " + age+ ".");
//         else System.out.println("You are " + age + ".");
//       }

        /*
        Write a program to ask user to enter the day
        Let user know the check in hours
        In case of any error, catch it and print the error
        Finally, print the current date - day
         */

       int day = ScannerHelper.getANumber();
       try {
           System.out.println(Permission.getCheckIn(day));
       }
       catch (Exception e){
           e.printStackTrace();
       }finally {
           Date date = new Date();
           SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
           System.out.println("Current day = " + dateFormat.format(date));
       }



    }
}

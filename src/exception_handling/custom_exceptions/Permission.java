package exception_handling.custom_exceptions;

import utilities.ScannerHelper;

public class Permission {


    public static boolean isAgeValid(int age){

        if (age > 16) return true;
        else throw new IllegalStateException("Age of " + age + " is restricted!!!!");

    }



    public static String getCheckIn(int day){


        if (day >=2 && day <=6 )return  "Check in hours are from 10 am to 5 PM";
        else if (day ==1 || day == 7 ) return  "Check in hours are from 10 am to 3 PM";
        else throw new IllegalStateException("The input does not represent any day!");

    }


    public static void main(String[] args) {
//        int age = ScannerHelper.getAnAge();
//        System.out.println(isAgeValid(age));

        int day = ScannerHelper.getANumber();
        System.out.println(getCheckIn(day));


    }
}

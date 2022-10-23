package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

public class Project04 {
    public static void main(String[] args) {


       //TASK 1
//        System.out.println("\n~~~~~~~~~~~~~~~TASK 1~~~~~~~~~~~~~~~");

        /*
        String: " TechGlobal"
        Swap to: "obalGlTech
        TechGlobal - Tech Gl obal
         */

//        String str = ScannerHelper.getAString();
//        String newStr = "";
//        if (str.length() < 8) System.out.println("This String does not have 8 characters");
//        else {
//           newStr = str.substring(str.length()/2+1) + str.substring(str.length()/2-1, str.length()/2+1) +
//                   str.substring(0,str.length()/2-1);
//            System.out.println(newStr);
//        }

//        //TASK 2
//        System.out.println("\n~~~~~~~~~~~~~~~TASK 2~~~~~~~~~~~~~~~");
//
//        String sentence = ScannerHelper.getAString();
//        if
//        for (int i = 0; i < sentence.length();i++){
//            if ()
//        }

//        //TASK 3
//        System.out.println("\n~~~~~~~~~~~~~~~TASK 3~~~~~~~~~~~~~~~");
//
//        String str1 = "These books are so stupid";
//        String str2 = "I like idiot behaviors";
//        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        //Task4
//        System.out.println("\n~~~~~~~~~~~~~~~TASK 4~~~~~~~~~~~~~~~\n");

//        String userName = ScannerHelper.getAName();
//        String newUserName = "";
//        if (userName.length()< 2) System.out.println("Invalid input!!!");
//        for (int i = 0; i < userName.length(); i++) {
//            if (userName.length()/2 == 1) System.out.println(userName.length()/2 +1);

//        //Task5
//        System.out.println("\n~~~~~~~~~~~~~~~TASK 5~~~~~~~~~~~~~~~\n");
//
//        String country = ScannerHelper.getAString();
//        if (country.length()<2){
//            System.out.println("Invalid input");
//        }else {
//            System.out.println(country.substring(2,country.length()-2));
//        }

        //Task7
        System.out.println("\n~~~~~~~~~~~~~~~TASK 7~~~~~~~~~~~~~~~\n");

        int random = RandomNumberGenerator.getARandomNumber(0,25);
        int newRandom = 0;
        for (int i = 0; i < random; i++) {
            if (random % 5 != 0) newRandom++;
        }
        System.out.println(newRandom);


        }
    }


package methods;

import utilities.PrintUtils;

public class MethodPractices {
    public static void main(String[] args) {
        MethodPractices.stringChecker("JavaScript");
        System.out.println();
        MethodPractices.printMiddle("civic");
        System.out.println();
        MethodPractices.printFirstLastSame("xyxy");

    }

    public static void stringChecker(String str) {

        if (str.length() > 0) {
            System.out.println("Length is = " + str.length());
            System.out.println("First char is = " + str.charAt(0));
            System.out.println("Last char is = " + str.substring(str.length() - 1));
            PrintUtils.ifThereVowels(str);
        } else {
            System.out.println("Length is zero");
        }


    }

    public static void printMiddle(String str1) {
        if (str1.length() < 3) {
            System.out.println("Length is less than 3");
        } else {
            if (str1.length() % 2 == 0) {
                System.out.println(str1.substring(str1.length() / 2 - 1, str1.length() / 2 + 1));
            } else {
                System.out.println(str1.substring(str1.length() / 2));
            }
        }
    }

        public static void printFirstLastMiddle(String flm){

            if (flm.length() < 4){
                System.out.println("INVALID CHARACTER");
            }else {
                System.out.println("The first two characters = " + flm.substring(0,2) +
                        "\nThe last two characters = " + flm.substring(flm.length()-2) +
                        "\nThe other characters are = " + flm.substring(2, flm.length()-2));
                }
            }

            public static void printFirstLastSame(String fls){

            if (fls.length() < 2){
                System.out.println("Length is less than 2");
            }else {
                   if (fls.substring(0,2).equals(fls.substring(fls.length()-2))){
                        System.out.println("true");
                    }else {
                       System.out.println("false");
                }
            }
            }
        }
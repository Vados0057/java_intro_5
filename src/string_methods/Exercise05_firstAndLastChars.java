package string_methods;

import utilities.ScannerHelper;

public class Exercise05_firstAndLastChars {
    public static void main(String[] args) {

       String name =  ScannerHelper.getAName();
       char firstChar = name.charAt(0);
       char lastChar = name.charAt(name.length()-1);
        System.out.println("First character is: " + firstChar);
        System.out.println("Last character is: " + lastChar);
    }
}

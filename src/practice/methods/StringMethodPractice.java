package practice.methods;

import utilities.ScannerHelper;

public class StringMethodPractice{

    public static void main(String[] args) {
        System.out.println(StringMethodPractice.isCharExisting("John",'o', 1));





    }

    /*

     */
    public static boolean isCharExisting(String str, char c, int index){
      return  str.charAt(index) == c;

    }

    public static boolean IsCharContained(String str, char myChar) {
        //return str.contains(String.valueOf(myChar));
        return str.contains(myChar + "");
    }
}

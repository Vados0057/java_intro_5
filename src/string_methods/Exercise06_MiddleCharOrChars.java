package string_methods;

import utilities.ScannerHelper;

public class Exercise06_MiddleCharOrChars {
    public static void main(String[] args) {
        /*
        Olena       -> e       -> s.charAt(s.length()/2)
        Ali       -> l       -> s.charAt(s.length()/2)
        Suzanne       -> a       -> s.charAt(s.length()/2)

        John        -> oh   -> s.substring(s.length()/2-1, s.length()/2+1);
        Abdallah        -> al   -> s.substring(s.length()/2-1,s.length()/2+1);
        Yildiz          -> ld   -> s.substring(s.length()/2-1, s.length()/2+1);

        Write a program that ask user to enter a name
        find middle char if the name has odd count of character
        find middle 2 char if the name has even counted of the characters
         */

        String name = ScannerHelper.getAName();

        if ( name.length()%2 == 0) {
            System.out.println("Middle chars are = " + name.substring(name.length()/2-1, name.length()/2+1));
        }
        else{
            System.out.println("Middle char is = " + name.charAt(name.length() / 2 ));
        }
        /*
        First or last n  character
        s.substring(0,n)    ->      first char
        s.substring(s.length()-n)     ->    last char
         */


    }
}

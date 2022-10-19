package homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test{

    public static void main(String [] args){

        char character ='u';

        if (character >= 65 && character <= 90 || character >= 97 && character <= 122) {
            if (character == 65 || character == 69 || character == 73 || character == 79 ||
                    character == 85 || character == 97 || character == 101 || character == 105 || character == 111 ||
                    character == 118) {
                System.out.println("The letter is vowel");
            }else {
                System.out.println("The letter is consonant");
            }
        }else {
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("End of the program!\n");
    }
}

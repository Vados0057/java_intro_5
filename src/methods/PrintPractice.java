package methods;

import utilities.MathHelper;
import utilities.PrintUtils;

public class PrintPractice {
    public static void main(String[] args) {

        PrintUtils myPrint = new PrintUtils();
        myPrint.printHello(); //Hello
       // myPrint.printName("Vlad");

        PrintUtils.printName("Vlad");
        PrintUtils.printName("Viktoriia");
        PrintUtils.printName("John");


    }
}

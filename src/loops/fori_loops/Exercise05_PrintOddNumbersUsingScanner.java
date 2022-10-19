package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise05_PrintOddNumbersUsingScanner {
    public static void main(String[] args) {


            //ODD NUMBERS FROM THE USER


       int a = ScannerHelper.getANumber();

        for (int i = 0; i <= a; i++) {
            if (i % 2 == 1 ) System.out.println(i);
        }
    }
}

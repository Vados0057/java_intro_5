package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise06_PrintEvenNumbersUsingScanner {
    public static void main(String[] args) {

        int a = ScannerHelper.getANumber();
        int b = ScannerHelper.getANumber();

        for (int i = Math.min(a,b); i <= Math.max(a,b); i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}

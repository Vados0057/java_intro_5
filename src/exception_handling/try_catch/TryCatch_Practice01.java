package exception_handling.try_catch;

import utilities.ScannerHelper;

public class TryCatch_Practice01 {

    public static void main(String[] args) {

        String name = ScannerHelper.getAName();

        try {
            System.out.println(name.charAt(3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Hello " + name);



    }

}

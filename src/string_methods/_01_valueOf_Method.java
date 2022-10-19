package string_methods;

public class _01_valueOf_Method {
    public static void main(String[] args) {
        /*
        1.Return type
        2.Returns a String
        3.Static(Called by the class name)
        4.Takes an arguments - There are many overloaded valueOf() methods
         */

        int num = 125;

        String numString = String.valueOf(num);
        System.out.println(num + 5); //125 + 5 = 130
        System.out.println(numString + 5); //125 + 5 = 1255
    }

}

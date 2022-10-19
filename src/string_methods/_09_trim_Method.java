package string_methods;

public class _09_trim_Method {
    public static void main(String[] args) {
        /*
        1 return
        2.return string
        3.non-static
        4.no arguments and not overloaded
         */

        String s1 = "  Hello   ";
        System.out.println(s1.length());//10
        System.out.println(s1.trim().length());//5

        s1 = s1.trim();
        System.out.println(s1);
        System.out.println(s1.length());
    }
}

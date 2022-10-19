package string_methods;

public class _11_startsWith_endsWith_Methods {
    public static void main(String[] args) {
        String s = "TechGlobal";
        /*
        1.return
        2.return boolean
        3.non-static
        4.There are overloaded methods but we will use always with single arguments as String.
         */

        System.out.println(s.startsWith("T")); //true
        System.out.println(s.startsWith("t")); //false
        System.out.println(s.startsWith("Tech")); //true

        System.out.println(s.endsWith("Global")); //true
        System.out.println(s.endsWith("l")); //true
        System.out.println(s.endsWith("L")); //false

        //IMPORTANT

        String city = "Chicago";
        System.out.println(city.startsWith(city));// true
        System.out.println(city.endsWith(city));// true

        System.out.println(city.startsWith(""));//true
        System.out.println(city.endsWith(""));//true

        System.out.println(city.startsWith("M"));//false
        System.out.println(city.endsWith("lin"));//false


    }

}

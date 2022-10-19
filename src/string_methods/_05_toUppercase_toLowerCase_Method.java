package string_methods;

public class _05_toUppercase_toLowerCase_Method {
    public static void main(String[] args) {
        /*
        1.return
        2.return
        3.non-static
        4.The one we use does not take any arguments - there are overloaded methods
         */

        String name = "John";

        System.out.println(name.toLowerCase()); //john
        System.out.println(name.toUpperCase()); //JOHN

        System.out.println("hello".toUpperCase()); //HELLO
        System.out.println("HELLO".toLowerCase()); //hello

        System.out.println("abc".toUpperCase().toLowerCase());// abc

        System.out.println("ab".toUpperCase().concat("xY".toLowerCase()).toLowerCase());//abxy

    }
}

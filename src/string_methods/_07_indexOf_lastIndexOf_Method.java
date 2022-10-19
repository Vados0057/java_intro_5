package string_methods;

public class _07_indexOf_lastIndexOf_Method {
    public static void main(String[] args) {
        /*
        1.return
        2.returns int which is matching index
        3.non-static
        4.It takes a char or String - there are overloaded method
         */

        String company = "TechGlobal School";

        int firstIndexOfO = company.indexOf('o'); //6

        System.out.println(firstIndexOfO);

        int lastIndexOfO = company.lastIndexOf('o'); //15

        System.out.println(lastIndexOfO);

        System.out.println(company.indexOf('l'));
        System.out.println(company.lastIndexOf('l'));

        System.out.println(company.indexOf('X')); // -1

        System.out.println(company.indexOf("School")); //11
    }

}

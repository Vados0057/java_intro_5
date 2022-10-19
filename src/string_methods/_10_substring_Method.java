package string_methods;

public class _10_substring_Method {
    public static void main(String[] args) {
        /*
            1.return
            2.return a String
            3.non-static
            4.it is overloaded and takes either one or 2 index arguments.
         */

        String s ="TechGlobal";
        String s1 = s.substring(4);//get "Global"  from index 4 to the end.
        System.out.println(s1);

        //Get "Tech"

        String s2 = s.substring(0,4); // here we will use second type of substring method with the first letter end number
        System.out.println(s2);

        /*
        If we go throughout of exceptions - error
        In "TechGlobal" only 9 characters, so > that 10 - impossible!!!
         */

    }
}

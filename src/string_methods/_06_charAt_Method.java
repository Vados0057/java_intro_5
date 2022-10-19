package string_methods;

public class _06_charAt_Method {
    public static void main(String[] args) {

        /*
        1. return
        2.returns char  at given index
        3.
         */

        String sentence = "Java is fun";

       char c1 =  sentence.charAt(3); // 'a'
       char c2 =  sentence.charAt(4); // ' '
        System.out.println(c1);
        System.out.println(c2);

        System.out.println(sentence.charAt(9)); //u

        //NOTE: Runtime error
        //System.out.println(sentence.charAt(-5));
        //System.out.println(sentence.charAt(50));
        //System.out.println(sentence.charAt(1).toUpperCase );-> not possible.Never use it

        System.out.println("\nEnd of the program");


    }
}
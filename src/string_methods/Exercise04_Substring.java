package string_methods;

public class Exercise04_Substring {
    public static void main(String[] args) {

        //=========TASK 1============
        String s1 = "The best is Java";
        String s2 = s1.substring(12);
        System.out.println(s2);

        //Alternatives

        System.out.println(s1.substring(s1.indexOf("Java")));
        System.out.println(s1.substring(s1.length()-4));

        //=========TASK 2============

            /*
            TASK-2
            Assume you are given below sentence
             "Java is an object-oriented programming language"
            Write a Java program that extracts "Java" and "object-oriented" from given sentence
            And store extracted values in separate Strings
            Finally, print the extracted Strings

             */

        String str1 = "Java is an object-oriented programming language";

        String str2 =str1.substring(0,4);
        String str3 =str1.substring(11,26);
        System.out.println(str2);
        System.out.println(str3);

        String java = "Java";
        String oo = "object-oriented";

        System.out.println(str1.substring(str1.indexOf(java),java.length()));
        System.out.println(str1.substring(str1.indexOf(oo),str1.indexOf(oo)+oo.length()));




    }
}

package string_methods;

public class _13_replace_Method {
    public static void main(String[] args) {
        /*
        1.return
        2.return String
        3.non-static
        4.Overloading have 2 args( one takes 2 Chars to replace or 2 String to replace)
         */
        String s = "Can i can a can";
        String s1 = s.replace('c','x'); // Can i xan a xan
        System.out.println(s1);
        System.out.println(s.replace("can","xxx"));// Can I xxx a xxx
        System.out.println(s.toLowerCase().replace("can","xxx")); // xxx i xxx a xxx

        //IMPORTANT

        String str1 = "John";
        str1 =  str1.replace("o", "oooo");

        System.out.println(str1);
        String str2 = "apple";
        str2 = str2.replace("abc", "xyz");
        System.out.println(str2);

        String str3 = "Orange";
        str3 = str3.replace(str3, "");
        System.out.println(str3);

    }
}

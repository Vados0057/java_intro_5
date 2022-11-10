package regex;

import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {

                        // LONG WAY
        System.out.println(Pattern.matches("[a-zA-z0-9_-]{8,15}", "JohnDoe_123")); // true;
                        // SHORT CUT
        System.out.println(Pattern.matches("[\\w_-]{8,15}", "JohnDoe_123")); // true;

                        /**
                            \\w provides all the characters in the word. So instead of using
                        all the letters that is allowed int our test
                         **/

        System.out.println(Pattern.matches(".+", "JohnDoe_123 &^%")); // true;

                        /**
                         So . means that we can use anything in our string.
                         But it works only if we will add a length as well.
                         */

        //SSN

        System.out.println("\n========SSN========\n");
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "333-22-1234")); // true;

        System.out.println("\n======PHONE NUMBER (XXX)-XXX-XXXX=======\n");
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}", "(000)-000-0000")); // true;

        String str = "How much wood would a wood chuck chuck if a wood chuck could chuck wood";
        System.out.println(str.replaceAll("wood", "****"));

                         /**
                            IF we just need to replace some words with something else, we can
                            use replaceAll() method.
                          */

    }
}
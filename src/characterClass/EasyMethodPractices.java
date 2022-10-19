package characterClass;

public class EasyMethodPractices {
    public static void main(String[] args) {


        String s1 = "2860 south river road des plaines il";
        System.out.println("String: \"" + s1 + "\" has " + countLetters(s1) + " letters");


        /*
        Create a public static method which will takes a strings and return thr numbers of those Letters.
         */

        //"2860 south river road des plaines il"  <- future string --> 26
        //"1234 *&%^## TechGlobal" -->10


    }

    public static int countLetters(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) { // i = 0, 1, 2, 3, 4, ........ L -1
            if (Character.isLetter(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
}

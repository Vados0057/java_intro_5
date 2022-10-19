package characterClass;

public class EasyMethodPractices {
    public static void main(String[] args) {


//        String s1 = "2860 south river road des plaines il";
//        System.out.println("String: \"" + s1 + "\" has " + countLetters(s1) + " letters");
        String s2 = "TeChGloBal";

        System.out.println("String: \"" + s2 + "\" has " + upperCaseCounter(s2) + " upper case letters");

    }
    /*
    Create public static method which will take a String and counts the uppercase letters and returns it
    "1234 *&%^## TechGlobal" -->2
    "TeChGloBal" --> 4
    "TeChGloBal 1234 *&%^##" --> 4
     */

    /*
       Create a public static method which will takes a strings and return thr numbers of those Letters.
        */

    //"2860 south river road des plaines il"  <- future string --> 26
    //"1234 *&%^## TechGlobal" -->10

    public static int countLetters(String s) {
        int counter = 0;
        for (int i = 0; i < s.length(); i++) { // i = 0, 1, 2, 3, 4, ........ L -1
            if (Character.isLetter(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static int upperCaseCounter(String s){

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }
}
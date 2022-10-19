package characterClass;

public class EasyMethodPractices {
    public static void main(String[] args) {


//        String s1 = "2860 south river road des plaines il";
//        System.out.println("String: \"" + s1 + "\" has " + countLetters(s1) + " letters");
        String s2 = "TeChGloBal";

        System.out.println("String: \"" + s2 + "\" has " + upperCaseCounter(s2) + " upper case letters");



    }


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


    /*
    Create public static method which will take a String and counts the uppercase letters and returns it
    "1234 *&%^## TechGlobal" -->2
    "TeChGloBal" --> 4
    "TeChGloBal 1234 *&%^##" --> 4
     */

    public static int upperCaseCounter(String s){

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))){
                counter++;
            }
        }
        return counter;
    }

    /*
    Create a public static method  named as printStringAttributes and print the message dynamically for the string

    "Given "(string)" has:
    x amount of uppercases
    x amount of lower cases
    x amount of letters
    x amount of digits
    x amount of spaces
    x amount of special characters
     */

    public static void printStringAttributes(String s) {
        int upperC = 0, lowerC = 0, letterC = 0, digitC = 0, spaceC = 0, specialC = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                letterC++;
                if (Character.isUpperCase(c)) {
                    upperC++;
                } else {
                    lowerC++;
                }
            } else if (Character.isDigit(c)) {
                digitC++;
            } else if (Character.isWhitespace(c)) {
                spaceC++;
            } else {
                specialC++;
            }
        }

        System.out.println("Given \"" + s + "\"has:\n"
                + upperC + " amount of upper cases\n"
                + lowerC + " amount of lower cases\n"
                + letterC + " amount of letters\n"
                + digitC + " amount of digits\n"
                + spaceC + " amount of spaces\n"
                + specialC + " amount of special characters.");
    }
}
package loops;

public class Exercise05_FindTheIndexOf {
    public static void main(String[] args) {
 /*
        "I love Java", 'a' ->  8
        "Banana", 'a' -> 1
        "Banana", 't' -> -1
         */
//        System.out.println("1. " + findFirstIndexOf("I love Java", 'a'));
//        System.out.println("2. " + findFirstIndexOf("Banana", 'a'));
//        System.out.println("3. " + findFirstIndexOf("Banana", 't'));


        System.out.println(clearWord("I love Java", "av"));

    }

    /*
    Create a public static method named as findFirstIndexOf() and it will take a String,
    and a char then it will return the index of the first occurrence of the char. If the
    char doesn't exist in the String then return -1.
    Example:
    "I love Java", 'a' ->  8
    "Banana", 'a' -> 1
    "Banana", 't' -> -1
     */

    public static int findFirstIndexOf(String s, char c){

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }

    /*
    Create a public static method named as findLastIndexOf() and it will take a String,
    and a char then it will return the index of the last occurrence of the char. If the
    char doesn't exist in the String then return -1.
    Example:
    "I love Java", 'a' ->  10
    "Banana", 'a' -> 5
    "Banana", 't' -> -1
     */

    public static int findLastIndexOf(String s, char c){

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c){
                return i;
            }
        }
        return -1;
    }

    /*
    Create a public static method named as clearChar() and it will take a String,
    and a char then it will return the String without the given char.
    Example:
    "I love Java", 'a' ->  "I love Jv"
    "Banana", 'a' -> "Bnn"
    "Banana", 't' -> "Banana"
     */

    public static String clearChar(String s, char c){
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) !=c){
                newS += s.charAt(i);
            }
        }
        return newS;
    }

    /*
Create a public static method named as clearWord() and it will take two Strings,
then it will return the String without the given second String. If the second
String is bigger than the first one return empty.

Example:

"I love Java", "av" ->  "I love Ja"
"Banana", 'an' -> "Ba"
"Banana", 'bananananaa' -> ""
 */


    public static String clearWord(String s, String s1) {
        if (s1.length() > s.length()) {
            return "";
        }
        String newS = "";
        for (int i = 0; i < s.length(); i++) {
            if (!s.substring(i).startsWith(s1)) {
                newS += s.charAt(i);
            } else {
                i += s1.length()-1;
            }
        }
        return newS;
    }
}
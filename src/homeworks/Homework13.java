package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Homework13 {

    /*          Task1

                Requirement:
        -Create a method called hasLowerCase()
        -This method will take a String argument, and it will
        return boolean true if there is lowercase letter and false
        if it doesn’t.
        Test Data 1: “”
        Expected Result 1: false
        Test Data 2: “JAVA”
        Expected Result 2: false
        Test Data 3: “125$”
        Expected Result 3: false
        Test Data 4: “hello”
        Expected Result 4: true

                 */

    public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) return true;
        }
        return false;
    }

    /*          Task2

                Requirement:
        -Create a method called noZero()
        -This method will take one Integer ArrayList argument
        and it will return an ArrayList with all zeros removed
        from the original Integer ArrayList.
        NOTE: Assume that ArrayList size will be at least 1.
        Test Data 1: [1]
        Expected Result 1: [1]
        Test Data 2: [1, 1, 10]
        Expected Result 2: [1, 1, 10]
        Test Data 3: [0, 1, 10]
        Expected Result 3: [1, 10]
        Test Data 4: [0, 0, 0]
        Expected Result 4: []

                 */

    public static ArrayList<Integer> noZero(ArrayList<Integer> arr){
        arr.removeIf(integer -> integer == 0);
        return arr;
    }

    /*          Task3

                Requirement:
        -Create a method called numberAndSquare()
        -This method will take an int array argument and it will
        return a multidimensional array with all numbers
        squared.
        NOTE: Assume that array size is at least 1.
        Test Data 1: [1, 2, 3]
        Expected Result 1: [[1, 1], [2, 4], [3, 9]]
        Test Data 2: [0, 3, 6]
        Expected Result 2: [[0, 0], [3, 9], [6, 36]]
        Test Data 3: [1, 4]
        Expected Result 3: [[1,1], [4, 16]]

                 */

    public static int[][] numberAndSquare(int[] arr){
        int[][] result = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            result[i][0] = arr[i];
            result[i][1] = arr[i] * arr[i];
        }
        return result;
    }

    /*          Task4

                Requirement:
        -Create a method called containsValue()
        -This method will take a String array and a String
        argument, and it will return a boolean. Search the
        variable inside of the array and return true if it exists in
        the array. If it doesn’t exist, return false.
        NOTE: Assume that array size is at least 1.
        NOTE: The method is case-sensitive
        Test Data 1: [“abc”, “foo”, “java”], “hello”
        Expected Result 1: false
        Test Data 2: [“abc”, “def”, “123”], “Abc”
        Expected Result 2: false
        Test Data 3: [“abc”, “def”, “123”, “Java”, “Hello”], “123”
        Expected Result 3: true
        Hint: Use binarySearch() for easy solution

                 */

        public static boolean containsValue(String[] arr, String str){

            for (String s : arr) {
                if (s.equals(str)) return true;
            }
            return false;
        }

        /*          Task5

                    Requirement:
        -Create a method called reverseSentence()
        -This method will take a String argument and it will
        return a String with changing the place of every word.
        All words should be in reverse order. Make sure that there
        are two words inside the sentence at least. If there is no
        two words return “There is not enough words!”.
        NOTE: After you reverse, only first letter must be
        uppercase and the rest will be lowercase!
        Test Data 1: “Hello”
        Expected Result 1: “There is not enough words!”
        Test Data 2: “Java is fun”
        Expected Result 2: “Fun is java”
        Test Data 3: “This is a sentence”
        Expected Result 3: “Sentence a is this”
        Hint: Use split() for easy solution
        Note: Make the new first word’s first letter upper case
        and make the old first word’s first letter lower case.

                 */

    public static String reverseSentence(String str){
        str = str.toLowerCase().trim();
        String result = "";
        if(!str.contains(" ")) return "There is not enough words!";
        else{
            String[] arr = str.split(" ");
            for (int i = arr.length - 1; i >= 0; i--) {
                result += arr[i] + " ";
            }
        }
        result = result.substring(0,1).toUpperCase().concat(result.substring(1,result.length() - 1));
        return result;
    }

     /*          Task6

                 Requirement:
            -Create a method called removeStringSpecialsDigits()
            -This method will take a String as argument, and it will
            return a String without the special characters or digits.
            NOTE: Assume that String length is at least 1.
            NOTE: Do not remove spaces.
            Test Data 1: “123Java #$%is fun”
            Expected Result 1: “Java is fun”
            Test Data 2: “Selenium”
            Expected Result 2: “Selenium”
            Test Data 3: “Selenium 123#$%Cypress”
            Expected Result 3: “Selenium Cypress”

                 */

    public static String removeStringSpecialsDigits(String str){
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//                if (!Character.isDigit(str.charAt(i)) && Character.isWhitespace(str.charAt(i)) ||
//                        Character.isLetter(str.charAt(i)))
//                   sb.append(str.charAt(i));
//            }
//        return sb.toString();

        return str.replaceAll("[^A-Za-z ]+", "");
    }

    /*          Task7

                Requirement:
        -Create a method called removeArraySpecialsDigits()
        -This method will take a String array as argument, and
        it will return a String array without the special
        characters or digits from the elements.
        NOTE: Assume that array size is at least 1.
        Test Data 1: [“123Java”, “#$%is”, “fun”]
        Expected Result 1: [“Java”, “is”, “fun”]
        Test Data 2: [“Selenium”, “123$%”, “###”]
        Expected Result 2: [“Selenium”, “”, “”]
        Test Data 3: [“Selenium”, “123#$%Cypress”]
        Expected Result 3: [“Selenium”, “Cypress”]

                 */

    public static String[] removeArraySpecialsDigits(String[] arr){
//
//        String[] result = new String[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            result[i] = removeStringSpecialsDigits(arr[i]);
//        }
//        return result;

        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i].replaceAll("[^A-Za-z]", "");
        }
        return arr;
    }

    /*          Task8

                Requirement:
        -Create a method called removeAndReturnCommons()
        -This method will take two String ArrayList and it will
        return all the common words as String ArrayList.
        NOTE: Assume that both ArrayList sizes are at least 1.
        Test Data 1: [“Java”, “is”, “fun”], [“abc”, “xyz”, “123”]
        Expected Result 1: []
        Test Data 2: [“Java”, “is”, “fun”], [“Java”, “C#”,
        “Python”]
        Expected Result 2: [“Java”]
        Test Data 3: [“Java”, “C#”, “C#”], [“Python”, “C#”, “C+
        +”]
        Expected Result 3: [“C#”]

                 */

    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){

        HashSet<String> check = new HashSet<>();
        for (String s : arr1) {
            for (String s1 : arr2) {
                if (s.equals(s1)) check.add(s);
            }
        }
        return new ArrayList<>(check);
    }

    /*          Task9

                Requirement:
            -Create a method called noXInVariables()
            -This method will take an ArrayList argument, and it will
            return an ArrayList with all the x or X removed from
            elements.
            If the element itself equals to x or X or contains only x
            letters, then remove that element.
            NOTE: Assume that ArrayList size is at least 1.
            Test Data 1: [abc, 123, #$%]
            Expected Result 1: [abc, 123, #$%]
            Test Data 2: [xyz, 123, #$%]
            Expected Result 2: [yz, 123, #$%]
            Test Data 3: [x, 123, #$%]
            Expected Result 3: [123, #$%]
            Test Data 4: [xyXyxy, Xx, ABC]
            Expected Result 4: [yyy, ABC]

                 */

    public static ArrayList<String> noXInVariables(ArrayList<String> arr){

        for(int i = 0; i < arr.size(); i++){
            arr.set(i, arr.get(i).replaceAll("[Xx]+", ""));
        }
        arr.removeIf(x -> x.equals(""));
        return arr;
    }


    public static void main(String[] args) {

        System.out.println("\n---------Task 1------------");

        System.out.println(hasLowerCase(""));
        System.out.println(hasLowerCase("JAVA"));
        System.out.println(hasLowerCase("1235&"));
        System.out.println(hasLowerCase("hello"));

        System.out.println("\n---------Task 2------------");

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1));
        System.out.println(noZero(numbers2));
        numbers2 = new ArrayList<>(Arrays.asList(1,1,10));
        System.out.println(noZero(numbers2));
        numbers2 = new ArrayList<>(Arrays.asList(0, 1, 10));
        System.out.println(noZero(numbers2));
        numbers2 = new ArrayList<>(Arrays.asList(0, 0, 0));
        System.out.println(noZero(numbers2));

        System.out.println("\n---------Task 3------------");

        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 2, 3})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 6})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 4})));

        System.out.println("\n---------Task 4------------");

        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "hello"));
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "Abc"));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "Java", "Hello"}, "123"));

        System.out.println("\n---------Task 5------------");

        System.out.println(reverseSentence("Hello"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));

        System.out.println("\n---------Task 6------------");

        System.out.println(removeStringSpecialsDigits("123Java #$%is fun"));
        System.out.println(removeStringSpecialsDigits("Selenium"));
        System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));

        System.out.println("\n---------Task 7------------");

        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));

        System.out.println("\n---------Task 8------------");

        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")),
                new ArrayList<>(Arrays.asList("abc", "xyz", "123"))));
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")),
                new ArrayList<>(Arrays.asList("Java", "C#", "Python"))));
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "C#", "C#")),
                new ArrayList<>(Arrays.asList("Python", "C#", "C++"))));

        System.out.println("\n---------Task 9------------");

        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("abc", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyz", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("x", "123", "#$%"))));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"))));

    }
}
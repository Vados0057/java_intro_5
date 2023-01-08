package homeworks;

public class Homework14 {

    //Task 1
    /*
            Create a method called fizzBuzz1()
        -This method will take an int argument, and it will print
        numbers starting from 1 to given argument. BUT, it will print
        “Fizz” for the numbers divided by 3, “Buzz” for the numbers
        divided by 5, and “FizzBuzz” for the numbers divided both by 3
        and 5.
     */

    public static void fizzBuzz1(int n){
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 ) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    //Task 2
    /*
        -Create a method called fizzBuzz2()
    -This method will take an int argument, and it will return
    a String. BUT it will return “Fizz” if the given number is
    divided by 3, “Buzz” if the number is divided by 5, and
    “FizzBuzz” if the number is divided both by 3 and 5.
    Otherwise, it will return number itself.
     */

    public static String fizzBuzz2(int n){
        String result = "";
        if (n % 3 == 0 && n % 5 == 0) result = "FizzBuzz";
        else if (n % 3 == 0) result = "Fizz";
        else if (n % 5 == 0) result = "Buzz";
        else result = String.valueOf(n);
        return result;
    }

    //Task 3
    /*
    -Create a method called findSumNumbers()
    -This method will take a String argument and it will return
    an int which is the sum of all numbers presented in the String.
    NOTE: If there are no numbers represented in the String,
    return 0.
     */

    public static int findSumNumbers(String str) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) sb.append(c);
                else {
                if (sb.length() > 0) {
                    sum += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            sum += Integer.parseInt(sb.toString());
        }
        return sum;
    }

    //Task 4
    /*
        -Create a method called findBiggestNumber()
    -This method will take a String argument and it will
    return an int which is the number presented in the
    String.
    NOTE: If there are no numbers represented in the String,
    return 0.
     */

    public static int findBiggestNumber(String str) {
        int max = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c))  sb.append(c);
            else {
                if (sb.length() > 0) {
                    int num = Integer.parseInt(sb.toString());
                    max = Math.max(max, num);
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            int num = Integer.parseInt(sb.toString());
            max = Math.max(max, num);
        }
        return max;
    }

    //Task 5
    /*
        -Create a method called countSequenceOfCharacters()
    -This method will take a String argument and it will
    return a String which is the count of repeated
    characters in a sequence in the String.
    NOTE: If given String is empty, then return empty String.
    NOTE: It is case sensitive!!!
     */

    public static String countSequenceOfCharacters(String str) {
        if (str.length() == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        char currentChar = str.charAt(0);
        int currentCount = 1;

        for (int i = 1; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == currentChar) {
                currentCount++;
            } else {
                sb.append(currentCount).append(currentChar);
                currentChar = c;
                currentCount = 1;
            }
        }

        sb.append(currentCount);

        return sb.toString();
    }

    public static void main(String[] args) {

        System.out.println("\n---------------TASK1------------");
        fizzBuzz1(3);
        System.out.println("--------------");
        fizzBuzz1(5);
        System.out.println("--------------");
        fizzBuzz1(18);

        System.out.println("\n---------------TASK2------------");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println("\n---------------TASK3------------");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));
        System.out.println(findSumNumbers("525$"));

        System.out.println("\n---------------TASK4------------");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045d"));
        System.out.println(findBiggestNumber("525"));

        System.out.println("\n---------------TASK5------------");
        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));
        System.out.println(countSequenceOfCharacters("aaAAa"));
    }
}
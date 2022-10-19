package utilities;

public class PrintUtils {

    public void printHello(){
        System.out.println("Hello");
    }

    public static void printName(String name){
        System.out.println("Hello " + name);
    }

    public static void ifThereVowels (String str){
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") ||
                str.toLowerCase().contains("i") || str.toLowerCase().contains("u") || str.toLowerCase().contains("o")){
            System.out.println("The string has vowel");
        }else {
            System.out.println("The string doesn't has vowels");
        }
    }

}

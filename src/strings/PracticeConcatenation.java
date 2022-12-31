package strings;


import java.util.HashMap;
import java.util.Map;

public class PracticeConcatenation {
    public static void main(String[] args) {
        // comand+r = replcae one to another

        String wordPart1 = "le";
        String wordPart2 = "ar";
        String wordPart3 = "ning";

        String myWord = wordPart1 + wordPart2 + wordPart3;
        System.out.println(myWord);

        String sentencePart1 = "I can";
        String sentencePart2 = "Learn Java";
        String mySentence = sentencePart1.concat(" ").concat(sentencePart2);
        System.out.println(mySentence);

        System.out.println("------------");
        System.out.println(reverse(sentencePart2));
        System.out.println("-------------");
    }
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }



}

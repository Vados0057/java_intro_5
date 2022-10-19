package strings;



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

    }
}

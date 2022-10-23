package arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {


        System.out.println("\n~~~~~~~~~~~~~~~ String Way~~~~~~~~~~~~~\n");
        String word = "Java";
        int charCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') charCounter++;
        }
        System.out.println(charCounter);

        System.out.println("\n~~~~~~~~~~~~~~~ Array way~~~~~~~~~~~~~\n");

        int aCounter = 0;
        for (char c : word.toCharArray()) {
            if (c == 'a') aCounter++;
        }
        System.out.println(aCounter);

        }
        }




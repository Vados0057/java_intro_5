package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        //TASK 1
        System.out.println("\n~~~~~~~~~~~~TASK 1~~~~~~~~~~~~\n");
        int[] numbers = new int[10];
        numbers[0]=89;
        numbers[2]=23;
        numbers[4]=12;
        numbers[6]=15;
        numbers[7]=34;
        numbers[9]=7;
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));


        //TASK 2
        System.out.println("\n~~~~~~~~~~~~TASK 2~~~~~~~~~~~~\n");

        String[] str = new String[5];
        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        //TASK 3
        System.out.println("\n~~~~~~~~~~~~TASK 3~~~~~~~~~~~~\n");

        int[] array = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //TASK 4
        System.out.println("\n~~~~~~~~~~~~TASK 4~~~~~~~~~~~~\n");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        //TASK 5
        System.out.println("\n~~~~~~~~~~~~TASK 5~~~~~~~~~~~~\n");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(dogs));
        Arrays.sort(dogs);
        System.out.println(Arrays.binarySearch(dogs, "Pluto") >= 0);

        //TASK 6
        System.out.println("\n~~~~~~~~~~~~TASK 6~~~~~~~~~~~~\n");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael",};
        System.out.println(Arrays.toString(cats));
        boolean hasCats = false;
        for (String cat : cats) {
            if (cat.equals("Garfield") && cat.equals("Felix")) hasCats = true;
            break;
        }
        System.out.println(hasCats);

        //TASK 7
        System.out.println("\n~~~~~~~~~~~~TASK 7~~~~~~~~~~~~\n");

        double[] doubles = {10.5, 20.75, 70.0, 80.0, 15.75};
        System.out.println(Arrays.toString(doubles));
        for (double d : doubles) {
            System.out.println(d);
        }

        //TASK 8
        System.out.println("\n~~~~~~~~~~~~TASK 8~~~~~~~~~~~~\n");

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        int letterCounter = 0, lowerCounter = 0, upperCounter = 0, digitCounter = 0, charCounter = 0;
        System.out.println(Arrays.toString(characters));
        for (char c : characters) {
            if (Character.isLetter(c)) {
                letterCounter++;
            if (Character.isLowerCase(c))
                    lowerCounter++;
            else if (Character.isUpperCase(c))
                    upperCounter++;
            }
            else if (Character.isDigit(c))
                digitCounter++;
            else charCounter++;
        }
        System.out.println("Letters = " + letterCounter);
        System.out.println("Uppercase letters = " + upperCounter);
        System.out.println("Lowercase letters = " + lowerCounter);
        System.out.println("Digits = " + digitCounter);
        System.out.println("Special characters = " + charCounter);

        //TASK 9
        System.out.println("\n~~~~~~~~~~~~TASK 9~~~~~~~~~~~~\n");

        String[] words = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(words));

        int upper = 0, lower = 0, startsWithBOrP = 0, containsBookOrPen = 0;
        for (String word : words) {
            // isuppercase -> takes char: returns boolean
            // charat -> takes index: returns char

            if (Character.isUpperCase(word.charAt(0))){
                upper++;
            }if ((Character.isLowerCase(word.charAt(0)))){
                lower++;
            }
            if (word.toLowerCase().contains("pen") || word.toLowerCase().contains("book")){
                containsBookOrPen++;
            }
            if (word.toLowerCase().startsWith("b") || word.toLowerCase().startsWith("p"))startsWithBOrP++;
        }

        System.out.println("Elements starts with uppercase = " + upper);
        System.out.println("Elements starts with lowercase = " + lower);
        System.out.println("Elements starting with B or P = " + startsWithBOrP);
        System.out.println("Elements having \"book\" or \"pen\"" + containsBookOrPen);

        //TASK 10
        System.out.println("\n~~~~~~~~~~~~TASK 10~~~~~~~~~~~~\n");

        int[] numbers1 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(numbers1));
        int more10 = 0, less10 = 0, numIs10 = 0;
        for (int n : numbers1) {
            if (n > 10)more10++;
            else if (n == 10) numIs10++;
            else less10++;
        }
        System.out.println("Elements that are more than 10 = " + more10);
        System.out.println("Elements that are less than 10 = " + less10);
        System.out.println("Elements that are 10 = " + numIs10);

        //TASK 11
        System.out.println("\n~~~~~~~~~~~~TASK 11~~~~~~~~~~~~\n");

        int[] firsArray = {5, 8, 13, 1, 2};
        int[] secondArray = {9, 3, 67, 1, 0};
        int[] thirdArray = new int[5];

        System.out.println(Arrays.toString(firsArray));
        System.out.println(Arrays.toString(secondArray));

        // HOW I CAN GET THIS ONE?????
//        thirdArray[0] = Math.max(firsArray[0],secondArray[0]);
//        System.out.println(thirdArray[0]);

        for (int i = 0; i < firsArray.length; i++) {
            thirdArray[i] = Math.max(firsArray[i], secondArray[i]);
        }

        System.out.println(Arrays.toString(thirdArray));
    }
}


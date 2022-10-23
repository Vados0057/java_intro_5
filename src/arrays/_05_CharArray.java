package arrays;

import java.util.Arrays;

public class _05_CharArray {
    public static void main(String[] args) {

        System.out.println("\n~~~~~~~~~~~~~~TASK 1~~~~~~~~~~~~~~\n");

                    /*
            TASK-1
            Create a char array and store values below
            #
            $
            5
            A
            b
            H

            Print the array

            EXPECTED:
            [#, $, 5, A, b, H]
             */

        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));

        System.out.println("\n~~~~~~~~~~~~~~TASK 2~~~~~~~~~~~~~~\n");
        //PRINTING THE SIZE OF THE ARRAY

        System.out.println("The size of the array is = " + characters.length);

        System.out.println("\n~~~~~~~~~~~~~~TASK 3~~~~~~~~~~~~~~\n");

                    /*
            TASK-3
            Print each element using fori loop

            EXPECTED:
            #
            $
            5
            A
            b
            H
            */

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        System.out.println("\n~~~~~~~~~~~~~~TASK 4~~~~~~~~~~~~~~\n");

        for (char character : characters){
            System.out.println(character);
        }

        System.out.println("\n~~~~~~~~~~~~~~TASK 5~~~~~~~~~~~~~~\n");

                        /*
                TASK-5
                Print each element that are letters

                EXPECTED:
                A
                b
                H
                 */

        System.out.println("\n----------TASK-5 - for each loop-----------\n");
        for(char element : characters){
            if(Character.isLetter(element)) System.out.println(element);
        }


        System.out.println("\n----------TASK-5 - fori loop-----------\n");
        for (int i = 0; i < characters.length; i++) {
            if(Character.isLetter(characters[i])) System.out.println(characters[i]);
        }

        System.out.println("\n----------TASK-6 -----------\n");
                /*
        TASK-6
        Count how many uppercase characters you have in the array

        EXPECTED:
        2
         */
        int charCounter = 0;
        for (char character:characters) {
            if (Character.isUpperCase(character))
                charCounter++;
        }
        System.out.println(charCounter);

        int charNum = 0;
        for (int i = 0; i < characters.length; i++) {
            if (Character.isUpperCase(characters[i]))
                charNum++;
        }
        System.out.println(charNum);
    }
    }



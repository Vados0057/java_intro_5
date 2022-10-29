package arrays;

import java.util.Arrays;

public class _11_charArrayRecap {
    public static void main(String[] args) {

        char[] chars = {'V', 'l', 'a', 'd'};
        char[] initials = new char[4];
        initials[0] = 'V';
        initials[1] = 'l';
        initials[2] = 'a';
        initials[3] = 'd';
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString(initials));

        //Reassigning
        initials[0] = 'v';
        System.out.println(Arrays.toString(initials));

        initials[0] = initials[3];

        System.out.println(Arrays.toString(initials));

        for (char in: initials) {
            System.out.print(in); //dlad
        }

    }
}

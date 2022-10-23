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

        String str[] = new String[5];
        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));

        //TASK 3
        System.out.println("\n~~~~~~~~~~~~TASK 3~~~~~~~~~~~~\n");

        int array[] = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //TASK 4
        System.out.println("\n~~~~~~~~~~~~TASK 4~~~~~~~~~~~~\n");

        String countries[] = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));

        //TASK 5
        System.out.println("\n~~~~~~~~~~~~TASK 5~~~~~~~~~~~~\n");

        String dogs[] = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
    }
}

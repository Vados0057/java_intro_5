package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework07 {
    public static void main(String[] args) {


        System.out.println("\n------------Task-1------------\n");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,23,67,23,78));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);

        System.out.println("\n------------Task-2------------\n");

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n------------Task-3------------\n");

        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));
        System.out.println(numbers2);
        Collections.sort(numbers2);
        System.out.println(numbers2);

        System.out.println("\n------------Task-4------------\n");

        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris"));
        System.out.println(countries);
        Collections.sort(countries);
        System.out.println(countries);

        System.out.println("\n------------Task-5------------\n");

        ArrayList<String> heroes = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man",
                "Black Panter", "Deadpool", "Captain America"));

        System.out.println(heroes);
        System.out.println(heroes.contains("Wolwerine"));


        System.out.println("\n------------Task-6------------\n");

        ArrayList<String> superHeroes = new ArrayList<>(Arrays.asList("Hulk", "Black Widow",
                "Captain America", "Iron Man"));

        System.out.println(superHeroes);
        System.out.println(superHeroes.contains("Hulk") && superHeroes.contains("Iron Man"));


        System.out.println("\n------------Task-7------------\n");

        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));

        System.out.println(chars);
        for (Character aChar : chars) {
            System.out.println(aChar);
        }

        System.out.println("\n------------Task-8------------\n");

        ArrayList<String> objects = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));

        System.out.println(objects);
        Collections.sort(objects);
        int mCounter = 0;
        int counterOfAAndE = 0;
        for (String object : objects) {
            if (object.toLowerCase().startsWith("m"))mCounter++;
            if (!object.toLowerCase().contains("a") && !object.toLowerCase().contains("e")) counterOfAAndE++;
        }
        System.out.println(mCounter);
        System.out.println(counterOfAAndE);

        System.out.println("\n------------Task-9------------\n");

        ArrayList<String> kitchenObjects = new ArrayList<>(Arrays.asList("Plate", "spoon",
                "fork", "Knife", "cup", "Mixer"));

        System.out.println(kitchenObjects);
        int upper = 0, lower = 0, hasP = 0,endWithP = 0;

        for (String kitchenObject : kitchenObjects) {
            if (Character.isUpperCase(kitchenObject.charAt(0))) upper++;
            if (Character.isLowerCase(kitchenObject.charAt(0))) lower++;
            if (kitchenObject.toLowerCase().contains("p")) hasP++;
            if (kitchenObject.toLowerCase().endsWith("p") || kitchenObject.toLowerCase().startsWith("p")) endWithP++;

        }
        System.out.println("Elements starts with uppercase = " + upper);
        System.out.println("Elements starts with lowercase = " + lower);
        System.out.println("Elements having P or p = " + hasP);
        System.out.println("Elements starting or ending with P or p = " + endWithP);

        System.out.println("\n------------Task-10------------\n");

        ArrayList<Integer> numbersTask10 = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));
        System.out.println(numbersTask10);
        int dividedBy10 = 0,evenMore15 = 0,oddLess20 = 0,less15Greater50 = 0;
        for (Integer integer : numbersTask10) {
            if (integer % 10 == 0) dividedBy10++;
            if (integer % 2 == 0 && integer > 15) evenMore15++;
            if (integer % 2 != 0 && integer < 20) oddLess20++;
            if (integer < 15 || integer > 50) less15Greater50++;
        }
        System.out.println("Elements that can be divided by 10 = " + dividedBy10);
        System.out.println("Elements that are even and greater than 15 =" + evenMore15);
        System.out.println("Elements that are odd and less than 20 = " + oddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15Greater50);






    }
}

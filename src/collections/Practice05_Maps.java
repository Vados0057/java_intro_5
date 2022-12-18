package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice05_Maps {
    public static void main(String[] args) {

        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        // Keys: Day, Color, City, Car, Pet
        // Values: Friday, Black, Chicago, Lexus, Turtle

        /*
        Get keys and print them
        [Car, Color, City, Day, Pet]
         */

        System.out.println(favorites.keySet()); // [Car, Color, City, Day, Pet]

        for (String s : favorites.keySet()) {
           System.out.println(s);
        }

        System.out.println(favorites.values());
        for (String value : favorites.values()) {
            System.out.println(value);
        }

        int count = 1;
        for (Map.Entry<String, String> fav : favorites.entrySet()) {
            System.out.println(count++ + "." + " key " + fav.getKey() + " and the value for it = " + fav.getValue());
        }

    }
}

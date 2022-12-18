package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class _07_Map_Implementations {
    public static void main(String[] args) {

        System.out.println(
                "We creating one HasMap which is not takes insertion order, it's random, but if we will \n" +
        "\tcreate it as a LinkedHashMap we will get elements in insertion order.\n" +
        "In both cases, one key as a null is allowed, and for the value it can be any amount of nulls. \n" +
        "With Hashtable null key or null value is not allowed, and if we have one we will get NullPointerException.\n" +
                " With the TreeMap, null can't be a key, because TreeMap Sort everything and Java don't know where to \n" +
                        "place null value.");

        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("-------------");
        System.out.println("We must to have different keys all the time");
        map.put(1, "Beyza");
        map.put(1, "Malek");

        System.out.println(map.size() + " - size");
        System.out.println(map);

        System.out.println("--------------");
        System.out.println("But the same value is fine");
        map.put(2, "Malek");
        System.out.println(map.size() + " - size");
        System.out.println(map);

        System.out.println("--------------");
        System.out.println("One null value is allowed");
        map.put(null, "Andrii");
        map.put(null, "Vlad");
        System.out.println(map.size() + " - size");
        System.out.println(map);

        System.out.println("--------------");
        System.out.println("If we have unique keys, but same value it's also fine");
        map.put(3, "Vicktoriia");
        map.put(4, null);
        map.put(5, null);
        map.put(6, null);

        System.out.println(map.size() + " - size");
        System.out.println(map);
    }
}
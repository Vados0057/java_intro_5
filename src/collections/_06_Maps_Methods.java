package collections;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class _06_Maps_Methods {
    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("France", "Paris");
        System.out.println(capitals); // {France=Paris}

        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");

        System.out.println(capitals); // {Italy=Rome, France=Paris, Germany=Berlin, Spain=Madrid}
        System.out.println(capitals.get("Spain")); // Madrid

        System.out.println("\n------------");
        System.out.println(capitals.get("Belgium")); // null
        System.out.println(capitals.getOrDefault("Belgium", "Does not exist")); // Does not exist
        System.out.println("------------\n");

        System.out.println("\n------------Check if map contains given key value----------------");
        System.out.println(capitals.containsKey("Germany")); // true
        System.out.println(capitals.containsKey("Portugal")); // false

        System.out.println("\n------------Check if map contains given value value----------------");
        System.out.println(capitals.containsValue("Ankara")); //false
        System.out.println(capitals.containsValue("Berlin")); //true

        System.out.println("\n------------Update the value for the specified key----------------");
        System.out.println(capitals.replace("Ukraine", "Kyiv")); // null
        System.out.println(capitals.replace("Germany", "berlin", "Munich")); // false
        System.out.println(capitals.replace("Germany", "Berlin", "Munich")); // false

        capitals.put("Turkey", "Ankara");
        System.out.println(capitals); // {Turkey=Ankara, Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}
        capitals.put("Turkey", "Istanbul");
        System.out.println(capitals); // {Turkey=Istanbul, Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}

        System.out.println("\n------------Remove some entries----------------");
        capitals.remove("France");
        System.out.println(capitals);
        capitals.remove("USA"); // null;
        System.out.println(capitals.remove("Germany", "Stuttgart")); // false
        System.out.println(capitals); // Germany is still there  {Turkey=Istanbul, Italy=Rome, Germany=Munich, Spain=Madrid}
        System.out.println(capitals.remove("Germany", "Munich")); //true
        System.out.println(capitals); // {Turkey=Istanbul, Italy=Rome, Spain=Madrid} (GERMANY REMOVED)

        System.out.println("\n------------Advance methods----------------");
        //Keys: Turkey, Italy, Spain
        //Values: Istanbul, Rome, Madrid

        TreeSet<String> treeSet = new TreeSet<>(capitals.keySet());
        System.out.println(treeSet + " With TreeSet");
        Set<String> set = capitals.keySet(); // Here we create the new Set of Countries
        System.out.println(set + " With Set\n"); // [Turkey, Italy, Spain]

        Collection<String> coll = capitals.values();
        System.out.println(coll + " With Collection"); // [Istanbul, Rome, Madrid]
        ArrayList<String> list = new ArrayList<>(capitals.values());
        System.out.println(list + " With ArrayList \n");


        System.out.println("\n-------------------Iterating Keys and Values---------------");
        System.out.println("Keys:");
        for (String s : capitals.keySet()) {
            System.out.println(s);
        }
        System.out.println("\nValues:");
        for (String value : capitals.values()) {
            System.out.println(value);
        }

        System.out.println("\n-------------------Getting all the entries---------------");

        Set<Map.Entry<String, String>> entries = capitals.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println("Key = " + entry.getKey() + "; Value = " + entry.getValue());
        }

    }
}

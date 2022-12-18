package collections;

import java.util.*;

public class Practice07_ProductPrice {
    public static void main(String[] args) {

        /*
        iPhone          -> 1000
        MacBook Pro     -> 1300
        iMack           -> 1500
        AirPods         -> 200
        iPad            -> 700

        Task1: Find the Most Expensive product, and print it as below

        Expected:
        iMac is the most expensive with the price of $1500

        1.Store the items in a HashMap
        2.Find max price value from HashMap Values
        3.Loop and find the item which has the value equals to a MaxPrice value.
         */

        HashMap<String, Double> products = new HashMap<>();
        products.put("iPhone", 1000.0);
        products.put("MacBook Pro", 1300.0);
        products.put("iMack", 1500.0);
        products.put("AirPods", 200.0);
        products.put("iPad", 700.0);

       double max  = new TreeSet<>(products.values()).last();

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey() + " is the most expensive " +
                        "with the price of $" + entry.getValue());
                break;
            }
        }
    }
}
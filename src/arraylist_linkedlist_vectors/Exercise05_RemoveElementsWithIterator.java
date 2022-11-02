package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise05_RemoveElementsWithIterator {
    public static void main(String[] args) {


        ArrayList<String> objects = new ArrayList<>(Arrays.asList(
                "Pen",
                "Pencil",
                "Book",
                "Notebook",
                "MacBook Pro"
        ));

        Iterator<String> object = objects.iterator();

        while (object.hasNext()) {

            String str = object.next();

            if (str.toLowerCase().contains("book")) object.remove();
        }
        System.out.println(objects);


//        ArrayList<String> food = new ArrayList<>(Arrays.asList("Pizza", "Pasta", "Burger",
//                "Lamb hops", "Salad", "Falafel", "Sushi"));
//
////        food.removeIf(x -> x.length() == 5);
////        System.out.println(food);
//
//        Iterator<String> foodIterator = food.iterator();
//
//        while(foodIterator.hasNext()){
//            String f =  foodIterator.next();
//
//            if (f.length() == 5) foodIterator.remove();
//        }
//
//        System.out.println(food);
//    }
    }
}

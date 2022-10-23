package arrays;

import java.util.Arrays;

public class SearchingInAStringArray {
    public static void main(String[] args) {

        System.out.println("\n~~~~~~~~~~~~~~~~~~WITH LOOPS~~~~~~~~~~~~~~~~~\n");
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};
        boolean ifContains = false;
        for (String object : objects) {
            if (object.equals("Mouse")) {
                ifContains = true;
                break;
            }
        }
        System.out.println(ifContains);

        System.out.println("\n~~~~~~~~~~~~~~~~~~WITH BINARY SEARCH~~~~~~~~~~~~~~~~~\n");

        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); //true
        System.out.println(Arrays.binarySearch(objects, "Computer") >= 0); //false
        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); //true

    }
}

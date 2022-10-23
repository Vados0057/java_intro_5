package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~LOOP VERSION~~~~~~~~~~~~~~~~~~~~\n");
        int[] numbers = {3, 5, 8, 10};
        //Search for 7 and return true if it exist in this array
        //Return false otherwise

        boolean hasNumber = false;
        for (int number : numbers){
            if (number == 7) {
                hasNumber = true;
                break;
            }
        }
        System.out.println(hasNumber);//false

        for (int number : numbers){
            if (number == 5) {
                hasNumber = true;
                break;
            }

        }
        System.out.println(hasNumber);


        System.out.println("\n~~~~~~~~~~~~~~~Binary Search In Arrays~~~~~~~~~~~~~~~\n");

        //NOTE: Binary search can be used if the array is sorted ONLY!!!!! Otherwise you will get a wrong result
        //Binary search returns the index of the element if found
        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5)); //1
        System.out.println(Arrays.binarySearch(numbers, 10)); //3
        System.out.println(Arrays.binarySearch(numbers, 9)); //-4( Its put not existed number in our array,
        //and count his index+1 and makes it negative

        //if two elements exist it takes the index of second one.


    }
}

package collections;

import java.util.*;

public class Practice04_MinMaxValues {
    public static void main(String[] args) {

//    /*
//    Find the max from given numbers below
//
//    [10, 100, 123, 507, 25] -> 507
//    [12] -> 12
//    [] -> ASK WHAT THEY WANT IN THIS CASE(EXCEPTION OR NULL?) null
//     */
//
//        System.out.println("-----------------MAX VALUE---------------");
//        System.out.println(findMax(new Integer[]{10, 100, 123, 507, 25})); //507
//        System.out.println(findMax(new Integer[]{12})); //12
//        System.out.println(findMax(new Integer[]{})); // null
//
//        /*
//    Find the max from given numbers below
//
//    [10, 100, 123, 507, 25] -> 10
//    [12] -> 12
//    [] -> ASK WHAT THEY WANT IN THIS CASE(EXCEPTION OR NULL?) null
//     */
//        System.out.println("\n-----------------MIN VALUE---------------");
//        System.out.println(findMin(new Integer[]{10, 100, 123, 507, 25})); //10
//        System.out.println(findMin(new Integer[]{12})); //12
//        System.out.println(findMin(new Integer[]{})); // null
//
//        System.out.println("\n-----------------SECOND MAX VALUE---------------");
//        System.out.println(findSecondMax(new Integer[]{10, 100, 123, 507, 25})); //123
//        System.out.println(findSecondMax(new Integer[]{12})); //null
//        System.out.println(findSecondMax(new Integer[]{12, 12, 12, 12})); //null
//        System.out.println(findSecondMax(new Integer[]{})); // null
//
//        System.out.println("\n-----------------SECOND MIN VALUE---------------");
//        System.out.println(findSecondMin(new Integer[]{10, 100, 123, 507, 25})); //25
//        System.out.println(findSecondMin(new Integer[]{10, 10,10,10})); //null
//        System.out.println(findSecondMin(new Integer[]{12})); //null
//        System.out.println(findSecondMin(new Integer[]{})); // null

        System.out.println("\n-----------------NTH MAX---------------");
        System.out.println(nthMax(new ArrayList<>(Arrays.asList(10, 100, 123, 507, 25)),3)); //100
//        System.out.println(nthMax(new ArrayList<>(Arrays.asList(10, 10, 10, 10)), 3)); //null
//        System.out.println(nthMax(new ArrayList<>(Arrays.asList()), 3)); //null
//        System.out.println(nthMax(new ArrayList<>(Arrays.asList(23, 25)), 3)); //null
//

        System.out.println("\n-----------------NTH MIN---------------");
//        System.out.println(nthMin(new ArrayList<>(Arrays.asList(10, 100, 123, 507, 25)),3)); //100
//        System.out.println(nthMin(new ArrayList<>(Arrays.asList(10, 10, 10, 10)), 3)); //null
//        System.out.println(nthMin(new ArrayList<>(Arrays.asList()), 3)); //null
        System.out.println(nthMin(new ArrayList<>(Arrays.asList(23, 25)), 3)); //null

    }
    /*old way
    public static int findMax(Integer[] arr){

        int max = Integer.MIN_VALUE;
        for (Integer i : arr) {
            if (i > max) max = i;
        }
        return max;
    }   */

    //new and easier way
    public static Integer findMax(Integer[] arr) {
       return new TreeSet<>(Arrays.asList(arr)).pollLast();
    }

    public static Integer findMin(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollFirst();
    }

    public static Integer findSecondMax(Integer[] arr){
      TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
      if (set.size() < 2) return null;
      set.pollLast();
      return set.last();
    }

    public static Integer findSecondMin(Integer[] arr){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        if (set.size() < 2) return null;
        set.pollFirst();
        return set.first();
    }

    /*
    Find the nth max from given numbers below

    [10, 100, 123, 507, 25], 4 -> 25
     */

    public static Integer nthMax(List<Integer> nums, int nth){
        TreeSet<Integer> set = new TreeSet<>(nums);
        if (set.size() < nth) return null;
        //nth -1 time pollLast() and then return last()
        for (int i = 1; i <= nth -1; i++) {
            set.pollLast();
        }
        return set.last();
    }

    public static Integer nthMin(List<Integer> nums, int nth){
        TreeSet<Integer> set = new TreeSet<>(nums);
        if (set.size() < nth) return null;
        //nth -1 time pollLast() and then return last()
        for (int i = 1; i <= nth -1; i++) {
            set.pollFirst();
        }
        return set.first();
    }
}
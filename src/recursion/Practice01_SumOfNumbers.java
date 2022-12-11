package recursion;

public class Practice01_SumOfNumbers {

            /*
        Create a public static method called as sum
        It takes an int which is a positive number
        It returns the sum of numbers starting from 1 to given int

        5 -> 1+2+3+4+5 -> 15
         */

        //Iterative way

    public static int sum(int end){
       int sum = 0;
        for (int i = 1; i <= end; i++) {
            sum += i;
        }
        return  sum;
    }

    public static int sumRecursively(int end){

       if (end != 0) return end + sumRecursively(end -1);
       return 0;
    }
    public static int productRecursively(int end){

        if (end != 1) return end * productRecursively(end -1);
        return 1;
    }

    public static void main(String[] args) {

        System.out.println(sum(5));
        System.out.println(sum(6));
        System.out.println(sum(8) + "\n");

        System.out.println(sumRecursively(5));
        System.out.println(sumRecursively(6));
        System.out.println(sumRecursively(8) + "\n");

        System.out.println(productRecursively(5));
        System.out.println(productRecursively(4));
        System.out.println(productRecursively(8));

    }
}

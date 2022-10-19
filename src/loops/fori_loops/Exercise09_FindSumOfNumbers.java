package loops.fori_loops;

public class Exercise09_FindSumOfNumbers {
    public static void main(String[] args) {

        int container = 0;

        for (int i = 10; i <= 15; i++) {
        container += i; //0 + 10 + 11 + 12 + 13 + 14 + 15 = 75
        }
        System.out.println(container); //75
    }
}
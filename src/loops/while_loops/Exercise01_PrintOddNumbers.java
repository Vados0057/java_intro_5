package loops.while_loops;

public class Exercise01_PrintOddNumbers {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            if (i % 2 == 1) System.out.println(i);
            i++;
        }
        System.out.println("End of the program");
    }
}

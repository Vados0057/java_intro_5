package loops.do_while_loops;

public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {
        System.out.println("\n----------- DO WHILE LOOP -------------\n");

        int i = 0;
        do{
            System.out.println(i);
            i++;
        }
        while(i < 5); //IF HERE WE WOULD HAVE A 0 INSTEAD OF 5, IT WILL STILL PRINT 0


        System.out.println("\n----------- WHILE LOOP -------------\n");
        int j = 0;
        while (j < 5){ //IF HERE WE WOULD HAVE A 0 INSTEAD OF 5, FAIL AND DIDN'T PRINT NOTHING
            System.out.println(j);
            j++;
        }
    }
}

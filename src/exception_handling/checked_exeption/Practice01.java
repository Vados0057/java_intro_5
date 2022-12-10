package exception_handling.checked_exeption;

public class Practice01 {
    public static void main(String[] args) throws InterruptedException{

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            Thread.sleep(250); // recommended to be handled with try-catch
        }
    }
}

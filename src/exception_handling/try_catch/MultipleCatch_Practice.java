package exception_handling.try_catch;

public class MultipleCatch_Practice {
    public static void main(String[] args) {

        String name = null;
        int age = 25;

        try{
            System.out.println(name.charAt(0));
            System.out.println(age / 0);

        }catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
        }
        catch (Exception arithmeticException){
            arithmeticException.printStackTrace();
        }
        System.out.println(name + "'s age is " + age);
    }
}

package casting;

public class ImplicitCasting {
    public static void main(String[] args) {

        //implicit casting known as  - widening - upcasting
        //everything happen automatically

        byte b = 25; // -128, 127
        int i = b;

        System.out.println(i);

        float f = 10.5F;
        double d = f;
        System.out.println(d);

    }
}

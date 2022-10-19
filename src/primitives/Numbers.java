package primitives;

public class Numbers {
    public static void main(String[] args) { //main// ps
        System.out.println(); //sop
        /*
        There are 6 primitives use to store numbers,
        from those 4: byte, short, int, long -> store absolute numbers like 3
        Float, double -> used for floating numbers like 10.5


        byte - -128 - 127 maximum   -> 1 byte
        short - 32767 maximum       -> 2 bytes
        int = -2147483647           -> 4 bytes
        Long                        -> 8 bytes

        Most of the case we use int, and it is enough

        John
        His age -> 45
        His favorite number = 70
        His balance -> 400.45
         */

        //dataType variableName = value;

        System.out.println("\n------------ Numbers - byte short --------\n");
        byte age = 45; // 127 - MAXIMUM
        short favNumber = 150; // 32767 - MAXIMUM
        long myNumber = 1L;

        // If the number is more than 127 its short
        System.out.println(age); //45
        System.out.println(favNumber); //70
        System.out.println(myNumber); //


        /*
        Floating Numbers
        float -> 4 bytes
        double -> 8 bytes
        Note:Most of the case we use double
         */
        System.out.println("\n------------Floating Numbers - float- double --------\n");
        float balance1 = 23.28762385762384F;
        double balance2 = 23.28762385762384;
        double price = 23.5;

        System.out.println(balance1); //23.28762385762384F
        System.out.println(balance2); //23.28762385762384
        System.out.println(price); //23.5

        double transaction = 20;
        System.out.println(transaction);

    }
}

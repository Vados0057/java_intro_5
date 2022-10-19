package operators.arithmetic_operators;

public class Exercise1 {
    public static void main(String[] args) {

        /*
        Assume that you have a rectangle
        Short side is equal 4 units
        Long side is equal to 7 units
        Find are and the perimeter  of the rectangle.

        Area = Short side * Long side
        Perimeter = 2 * shortSide + 2 + longSide
        Perimeter = 2 * (shortSide + longSide)
        Expected output:
        Area is = 28
        Perimeter = 22
         */

        System.out.println("\n========TASK======\n");

        int shortSide = 4, longSide = 7;

        System.out.println("Area is = " + shortSide * longSide);
        System.out.println("Perimeter = " + 2*(shortSide + longSide));
    }
}

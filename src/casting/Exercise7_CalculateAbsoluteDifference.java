package casting;

public class Exercise7_CalculateAbsoluteDifference {
    public static void main(String[] args) {

        /*
        TASK
        Find the absolute difference between s1 and s2
        Find the absolute difference between s3 and s2
        Find the absolute difference between s3 and s1

        Expected output:
        50
        100
        50
         */

        String s1 = "100", s2 = "150", s3 = "50";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        int i3 = Integer.parseInt(s3);

        System.out.println(Math.abs(i1 - i2));
        System.out.println(Math.abs(i3 - i2));
        System.out.println(Math.abs(i3 - i1));


    }
}

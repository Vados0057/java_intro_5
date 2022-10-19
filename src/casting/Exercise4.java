package casting;

public class Exercise4 {
    public static void main(String[] args) {
        //   (boolean) true false    ->      (String)"true" "false"

        System.out.println(true && false); // false
        //System.out.println("true" && "false");   -> COMPILER ERROR

        System.out.println(String.valueOf(true) + String.valueOf(false));//truefalse
        System.out.println("" + true + false);//truefalse

        System.out.println(String.valueOf('A') + 'a'); //"A" + 'a' -> Aa
        System.out.println("" + 10.5 + 5);// "10.5" + 5(concatenation) -> 10.55

    }
}

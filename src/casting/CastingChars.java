package casting;

public class CastingChars {
    public static void main(String[] args) {
        int i1 = 65;
        System.out.println(i1);
        char c1 = (char)i1;

        //If we are casting absolute number to char it means we are getting the ASCII Value for the char.
        //A in ASCII = 65
        System.out.println(c1);  //A

        System.out.println(51);
        System.out.println((char)51); // 3 (BECAUSE OF THE MEANING IN ASCII

        System.out.println((char) 123); // {
        System.out.println((char) 32); //
        System.out.println((char) 999999999);

        char char1 = 'A';  // IT'S okay
        char char2 = 97; // 'a'

        System.out.println(char1 + char2);  //162
        /*
        Java thinking that's it not a concatenation, but a summary!
         */

        System.out.println("" + char1 + char2); //Aa
        /*
        If we add "" + ( it will understand it as concatenation
         */
        System.out.println("" + (char1 + char2)); //162

        System.out.println(char1 + char2 + "");  //162
        System.out.println(char1 + "" + char2 );  //162


        /*
        primitive + String = String
        String + primitive = String
        p + p + S = number String
        p + S + p = String
        'A' + S + 'a' = Aa
        p + p + p + S + p + p + p = (1+1+1+""+1+1+1) =3111
         */

    }
}

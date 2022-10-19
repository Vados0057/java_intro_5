package casting;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println('A' + 'b' + 20 + " Hello" + 2 +1); // 183 Hello21
        /*
        183 + "Hello" + 2 + 1
        "183 Hello21"
         */

        System.out.println('A' + 'b' + 20 + " Hello" + (2 +1));// 183 Hello3
        /*
        parantanses first
        'A' + 'b' + 20 + " Hello" + 3
        163 + 20 + " Hello" + 3
        "183 Hello3"
         */

    }
}

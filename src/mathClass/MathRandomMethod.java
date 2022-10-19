package mathClass;

public class MathRandomMethod {
    public static void main(String[] args) {

        double myRandom = Math.random();
        int myRandomBetween0To10 = (int) (Math.random() * 10) ;
        int myDice = (int) (Math.random() * 6 ) +1;


        //System.out.println("Random number is = " + Math.random());
        System.out.println("Random number is = " + Math.random());
        System.out.println("Random number between 0 to 10 is = " + myRandomBetween0To10);
        System.out.println("My dice value is = " + myDice);

        //50 - 100
        int myRandomBetween50To100 = (int) (Math.random() * (100 - 50 + 1) + 50 );

        //(int)(randomNumber * (big point - small point + 1) + small point);
        System.out.println("My random number between 50 to 100 is = " + myRandomBetween50To100);

        int myRandomNumberBetween20To40 = (int) (Math.random() * (40 - 20 + 1) + 20);
        System.out.println("My random number between 20 - 40 is: " + myRandomNumberBetween20To40);


    }
}

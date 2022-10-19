package conditional_statemants.if_else_statemants;

import java.util.Scanner;

public class IfElseRandomPractice {
    public static void main(String[] args) {

        int myInt = (int) (Math.random() * (50 - 0 +1) +0);
        System.out.println("My random number is : " + myInt);
        if (myInt >= 10 && myInt <=25){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

        System.out.println(myInt >= 10 && myInt <=25? "True": "false");

        System.out.println((myInt >= 10 && myInt <=25));


        System.out.println("\n=========Task 2 ===========");

        int myRandom = (int) (Math.random() * (100)+1);
        System.out.println("My random number is : " + myRandom);

        if (myRandom<=50){
            System.out.println(myRandom + " is in the 1st half");
            if (myRandom <= 25){
                System.out.println(myRandom + " is in the 1st quarter");
            }
            else{
                System.out.println(myRandom + " is in the 2nd quarter");
            }
        }
        else {
            System.out.println(myRandom + " is in the 2nd half");
            if (myRandom <=75){
                System.out.println(myRandom + " is in the 3rd quarter");
            }
            else {
                System.out.println(myRandom + " is in the 4th quarter");
            }
        }


        Scanner input = new Scanner(System.in);

        System.out.println("Is it raining?");
        boolean isItRaining = input.nextBoolean();

        System.out.println("Do you have umbrella?");
        boolean doYouHaveUmbrella = input.nextBoolean();

        System.out.println("Are you hungry?");
        boolean areYouHungry = input.nextBoolean();

        if (isItRaining ){
            System.out.println("It is raining outside");
            if (doYouHaveUmbrella ){
                System.out.println("You can go outside");
            }
            else {
                System.out.println("You better stay at home:)");
            }
        }
        else{
            System.out.println("It is not raining outside.");
            if (areYouHungry ){
                System.out.println("You can go to chick-fil-a");
            }
            else{
                System.out.println("You are riding a bike");
            }
        }
    }
}

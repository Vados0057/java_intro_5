package practice.loopsPractice;

import utilities.RandomNumberGenerator;

public class WhileLoopsPractice {
    public static void main(String[] args) {

        int random = RandomNumberGenerator.getARandomNumber(1,20);
        int container = 0;
        while(random != 7){
            random = RandomNumberGenerator.getARandomNumber(1,20);
            if (random == 7){
                break;
            }
            container++;
            System.out.println("Random number = " + random);
        }
        System.out.println("Congrats you hit the number: " + random);
        System.out.println("It takes " + container + " attempt's");
    }
}

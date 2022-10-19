package conditional_statemants.ternary_operator;

import java.util.Random;

public class Exercise2_FindMin {
    public static void main(String[] args) {


        Random random = new Random();
        int randomNumberFromRandomClass = random.nextInt(10) + 1; // 1 - 10
        int randomNumberFromRandomClass2 = random.nextInt(10) + 1; // 0 - 9

        int min = randomNumberFromRandomClass < randomNumberFromRandomClass2 ?
                randomNumberFromRandomClass:randomNumberFromRandomClass2;

        System.out.println("The smallest number is : " + min);
    }
}

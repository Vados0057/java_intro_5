package projects;



public class Project03 {

    public static void main(String[] args){

        //TASK 1
        System.out.println("\n=======TASK 1=======");

        String s1 = "24";
        String s2 = "5";
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        double d1 = (double) i1;
        double d2 = (double) i2;


        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (i1 + i2));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " = " + (i1 - i2));
        System.out.println("The division of " + s1 + " and " + s2 + " = " + (d1 / d2));
        System.out.println("The multiplication of " + s1 + " and " + s2 + " = " + (i1 * i2));
        System.out.println("The remainder of " + s1 + " and " + s2 + " = " + (i1 % i2));

        //TASK 2
        System.out.println("\n=======TASK 2=======");


        int randomNumber = (int) (Math.random() *(35 - 1 + 1)) + 1;
        System.out.println(" Random number = " + randomNumber);

        switch (randomNumber){
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
            case 23:
            case 29:
            case 31:
                System.out.println("\n" + randomNumber + " IS A PRIME NUMBER");
                break;
            default:
                System.out.println("\n" + randomNumber + " IS NOT A PRIME NUMBER");
        }

        //TASK 3
        System.out.println("\n=======TASK 3=======");

        int number1 = (int) (Math.random() * (50 - 1 + 1)+1);
        int number2 = (int) (Math.random() * (50 - 1 + 1)+1);
        int number3 = (int) (Math.random() * (50 - 1 + 1)+1);

        System.out.println("Random number 1 = " + number1);
        System.out.println("Random number 2 = " + number2);
        System.out.println("Random number 3 = " + number3);

        if (number1 < number2 && number1 < number3){
            System.out.println("Lowest number is = " + number1);
        } else if (number1 > number2 && number1 > number3) {
            System.out.println("Greatest number is = " + number1);
        } else if (number1 > number2 && number1 < number3  || number1 < number2 && number1 >number3) {
            System.out.println("Middle number is = " + number1);
        }
        if (number2 < number1 && number2 < number3 ){
            System.out.println("Lowest number is = " + number2);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Greatest number is = " + number2);
        } else if (number2 > number1 && number2 < number3 || number2 < number1 && number2 > number3) {
            System.out.println("Middle number is = " + number2);
        }
        if (number3 < number1 && number3 < number2) {
            System.out.println("Lowest number is = " + number3);
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Greatest number is = " + number3);
        } else if (number3 > number1 && number3 < number2 || number3 < number1 && number3 > number2) {
            System.out.println("Middle number is = " + number2);
        }

        //TASK 4
        System.out.println("\n=======TASK 4=======");

        char myChar = '5';

        if (myChar >= 97 && myChar <= 122){
            System.out.println("The letter is lowercase");
        } else if (myChar >= 65 && myChar <= 90) {
            System.out.println("The letter is uppercase");
        }else {
            System.out.println("Invalid character detected");
        }

        //TASK 5
        System.out.println("\n=======TASK 5=======");

        char character ='U';

        if (character >= 65 && character <= 90 || character >= 97 && character <= 122) {
            if (character == 65 || character == 69 || character == 73 || character == 79 ||
                    character == 85 || character == 97 || character == 101 || character == 105 || character == 111 ||
                    character == 118) {
                System.out.println("The letter is vowel");
            }else {
                System.out.println("The letter is consonant");
            }
        }else {
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("End of the program!\n");

        //TASK 6
        System.out.println("\n=======TASK 6=======");

        char char1 = 'g';
        if (char1 >=48 && char1 <= 57 || char1 >=65 && char1 <= 90 || char1 >= 97 && char1 <= 122){
            System.out.println("Invalid character detected!!!");
        }else {
            System.out.println("Special character is = " + char1);
        }
        System.out.println("End of the program!\n");

        //TASK 7
        System.out.println("\n=======TASK 7=======");

        char c1 = '#';

        if (c1 >= 65 && c1 <= 90 || c1 >= 97 && c1 <= 122){
            System.out.println("Character is a letter!");
        } else if (c1>= 48 && c1 <= 57){
            System.out.println("Character is a digit!");
        } else  {
            System.out.println("Character is a special character!");
        }
        System.out.println("End of the program\n");
    }
}

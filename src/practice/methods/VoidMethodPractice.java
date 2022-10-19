package practice.methods;

import variables.VariableNaming;

public class VoidMethodPractice {
    public static void main(String[] args) {
        VoidMethodPractice.flavorPicker("chocolate");
        VoidMethodPractice.flavorPicker("Chocolate");
        VoidMethodPractice.flavorPicker("strawberry");
        VoidMethodPractice.flavorPicker("vanilla");

        VoidMethodPractice.checkAge(19);
        VoidMethodPractice.checkAge(20);
        VoidMethodPractice.checkAge(45);
        VoidMethodPractice.checkAge(-45);

        VoidMethodPractice.checkCreditScore(725.00);
        VoidMethodPractice.checkCreditScore(1250.00);
        VoidMethodPractice.checkCreditScore(2345.00);

    }

    /*
    Create a public static method which will take an ice cream flavor and print the message about your ice cream

    Examples:
    chocolate -> Your have a great taste
    vanilla -> Not bad
    strawberry -> Enjoy it
     */

    public static void flavorPicker(String flavor){
  /*      if (flavor.equals("chocolate")){
            System.out.println("You have a great taste");
        } else if (flavor.equals("vanilla")) {
            System.out.println("Not bad");
        }
        else if (flavor.equals("strawberry")){
            System.out.println("Enjoy it!");
        }
        else {
            System.out.println("Give me a valid flavor");
        }*/

        switch (flavor){
            case "chocolate":
                System.out.println("You have a great taste");
                break;
            case "vanilla":
                System.out.println("Not bad");
                break;
            case "strawberry":
                System.out.println("Enjoy it!");
                break;
            default:
                System.out.println("Give me a valid flavor");
                break;
        }


        }
        public static void checkAge(int age){

            if ( age >= 0 && age <= 19) {
                System.out.println("You are a teenager");
            } else if (age >=20 && age <=21) {
                System.out.println("You can drive");
            }
            else if (age > 21){
                System.out.println("You can drink coke");
            }
        }

        public static void checkCreditScore (double creditScore){
            if ( creditScore >= 0.00 && creditScore <= 999.99) {
                System.out.println("Low credit score");
            } else if (creditScore >=1000.00 && creditScore <=1999.99) {
                System.out.println("Medium credit score");
            }
            else if (creditScore >=2000.00 && creditScore <= 2999.99){
                System.out.println("Good credit score");
            }else {
                System.out.println("No valid credit score!");
            }

        }

}

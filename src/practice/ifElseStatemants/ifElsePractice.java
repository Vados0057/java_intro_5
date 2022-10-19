package practice.ifElseStatemants;

public class ifElsePractice {

    public static void main(String[] args) {

        int myInt = 52;

        if (myInt >= 0 && myInt <= 24) {
            System.out.println("First quarter");
        }
        else if (myInt >= 25 &&myInt <= 49){
            System.out.println("Second quarter");
        }
        else if (myInt >= 50 && myInt <=74){
            System.out.println("Third quarter");
        }



        int myNum = 47;
        if (myNum < 0 && myInt >= -50 ){
            System.out.println("Number is in negative part");
        } else if (myNum == 0) {
            System.out.println("Number is zero");
        } else if (myNum >= 1 && myNum <= 50) {
            System.out.println("Number is in positive part");
        }




    }
}

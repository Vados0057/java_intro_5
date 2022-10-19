package practice.ifElseStatemants;

public class practice {

    public static void main(String[] args) {

        int myRandom = (int) (Math.random() * (100)+1);

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
                System.out.println(myRandom + " is in the 4rt quarter");
            }
        }
    }
}

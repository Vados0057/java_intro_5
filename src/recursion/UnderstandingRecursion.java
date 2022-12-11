package recursion;

public class UnderstandingRecursion {
    public static void main(String[] args) {
//      print();  StackOverFlowError
//        untilGivenNumber(100);
        untilGivenNumberRecursively(5);




    }

    public static void untilGivenNumber(int a){
        for (int i = 1; i <= a; i++) {
            System.out.println(i);
        }
    }
    public static void untilGivenNumberRecursively(int end) { //5
        if (end == 0 ) return;
        untilGivenNumberRecursively(end - 1);
        System.out.println(end);
    }


    public static void print(){
        System.out.println("Hello");
        print();
    }
}

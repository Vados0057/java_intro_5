package conditional_statemants.ternary_operator;

public class UnderstandingTernary {
    public static void main(String[] args) {
        char gender = 'M';

        String name = gender == 'F' || gender == 'f'? "Jane" : "John";

        System.out.println(name);

    }
}

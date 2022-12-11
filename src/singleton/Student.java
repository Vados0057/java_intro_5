package singleton;

public class Student {

    private Student(){}

    private static Student student;

    public static Student getStudent() {
        if (student == null) student = new Student();
        return student;
    }

    public static void main(String[] args) {


Driver dr1 = Driver.getDriver();
Driver dr2 = Driver.getDriver();

        System.out.println(dr1);
        System.out.println(dr2);
    }
}

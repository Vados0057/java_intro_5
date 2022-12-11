package first_package;

import singleton.Student;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        /*
        Task
        Vladyslav
        Ksendziuk
         */

        System.out.println("Vladyslav");
        System.out.println("Ksendziuk");

        Student student = Student.getStudent();
        System.out.println(student);

    }
}
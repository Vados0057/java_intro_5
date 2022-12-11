package singleton;

public class StudentTest {
    public static void main(String[] args) {

        Student s1 = Student.getStudent();
        Student s2 = Student.getStudent();
        Student s3 = Student.getStudent();
        Student s4 = Student.getStudent();

        /*
        When we are running this code we will have a locations of the objects different
        after getter it's a new one!
        System.out.println(s1); //singleton.Student@1540e19d
        System.out.println(s2); //singleton.Student@677327b6
        System.out.println(s3); //singleton.Student@14ae5a5
        System.out.println(s4); //singleton.Student@7f31245a
         */

        System.out.println(s1); //singleton.Student@1540e19d
        System.out.println(s2); //singleton.Student@1540e19d
        System.out.println(s3); //singleton.Student@1540e19d
        System.out.println(s4); //singleton.Student@1540e19d

    }

}

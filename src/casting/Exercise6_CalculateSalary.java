package casting;

public class Exercise6_CalculateSalary {
    public static void main(String[] args) {
        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";

        /*
        Task 1 find min and max salary

        Output:
        Min salary = $4000.50
        max Salary  = $6000.25
         */

        double sal1 = Double.parseDouble(salary1);
        double sal2 = Double.parseDouble(salary2);
        double sal3 = Double.parseDouble(salary3);

        double minSalary = Math.min(Math.min(sal1,sal2),sal3 );
        System.out.println(" Min salary = $" + minSalary);
        System.out.println(" Max salary = $" + Math.max(Math.max(sal1,sal2),sal3));

        /*
        Calculate the 10% of the min.salary

        Output:
        400.05
         */

        System.out.println(minSalary / 10); // OR WE CAN SAY  * 0.1 ***********



    }
}

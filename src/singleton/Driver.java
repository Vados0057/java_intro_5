package singleton;

public class Driver {

    private Driver(){}

    private static Driver driver;

    public static Driver getDriver() {
        if(driver == null) driver = new Driver();
        return driver;
    }

    public static void main(String[] args) {


        Driver driver = getDriver();
        Driver driver1 = getDriver();

        System.out.println(driver1);
        System.out.println(driver);
    }
}

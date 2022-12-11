package enum_practices;

import java.time.Month;

public class TestCustomEnums {

    public static void main(String[] args) {
        System.out.println(Days.SATURDAY);

        Days[] days = Days.values();
        for (Days day : days) {
            System.out.println(day);
        }
        System.out.println(Month.JANUARY);



        for (Month month : Month.values()) {
            System.out.println(month);
        }
    }

}

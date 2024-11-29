// package JavanewFeatures;

import java.time.*;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDate date2 = date.plusDays(100);
        System.out.println(date2);
    }
}
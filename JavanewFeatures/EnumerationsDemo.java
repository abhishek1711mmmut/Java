// package JavanewFeatures;

// this features allow us to create a new data type
// introduced in jdk 1.5
// all enums are implicitly static, final and cannot be extended

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
// Day is a data type

public class EnumerationsDemo {
    public static void main(String[] args) {
        Day d = Day.TUESDAY;
        System.out.println(d);
    }
}

import java.util.Scanner;

public class ControlStructureDemo {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        marks = sc.nextInt();
        char grade = ' ';
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        System.out.println("Your marks is: " + marks + " and your grade is: " + grade);
    }
}

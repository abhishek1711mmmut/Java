// package JavanewFeatures;

import java.util.*;

// Assertions:
// An assertions is a condition that must be true during program executions
// Assertions are used to idetify logical errors in the program.
// In order to use assertions, assert keyword & java.lang.AssertionError were introduced in jdk 1.4 version.
// By default, assertions are disabled
// To enable assertions, we use the following:
// C:\java -ea Demo 
// or
// C:\java -enableassertions Demo

public class AssertDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 10");
        int num = sc.nextInt();
        assert (num >= 1 && num <= 10);
        System.out.println(num);
        sc.close();
    }
}

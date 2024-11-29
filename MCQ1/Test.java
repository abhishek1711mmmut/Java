package MCQ1;

import java.io.IOException;

import javax.imageio.IIOException;

class Employee {
    int salary = 0;

    Employee() {
        salary = 10;
    }

    public void changeSalary() {
        salary = salary + 1;
        System.out.println(salary);
    }
}

class PermanentEmployee extends Employee {
    public void changeSalary() {
        salary = salary + 2;
        System.out.println(salary);
    }
}

interface I1 {
}

interface I2 {
}

interface I3 extends I1, I2 {
}

class Two {
}

class Three extends Two implements I3 {
}

public class Test {
    public void m1(int a, float b){
        System.out.println("inside m1 method");
    }

    public void m1(float b, float a){
        System.out.println("inside m2 method");
    }
    public static void main(String[] args) {
        // Employee emp=new PermanentEmployee();
        // emp.changeSalary();
        // I3 obj = new Three();
        // if (obj instanceof I1) {
        //     System.out.println("I1 is implemented");
        // }
        // if (obj instanceof I2) {
        //     System.out.println("I2 is implemented");
        // }
        // if (obj instanceof I3) {
        //     System.out.println("I3 is implemented");
        // }
        // int arr[] = { 1, 2, 3, 4, 5 };
        // for (int num : arr) {
        //     System.out.println(num);
        // }
        
        // Test t = new Test();
        // t.m1(20, 20);

        String name="computer";
        StringBuffer sb=new StringBuffer(name);
        StringBuffer sb1=new StringBuffer();
        String name1=sb.reverse().toString();
    }
}

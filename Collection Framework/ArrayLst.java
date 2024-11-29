package Collection;

import java.util.ArrayList;

class Employee {
    int empNo;
    String name;
    float salary;

    public Employee(int empNo, String name, int salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return empNo + " " + name + " " + salary;
    }
}

public class ArrayLst {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Raj", 1000);
        Employee e2 = new Employee(2, "Raj", 2000);
        Employee e3 = new Employee(3, "Raj", 3000);
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        System.out.println(al);

        // for(int i=0;i<al.size();i++){
        // System.out.println(al.get(i));
        // }
        // System.out.println(al);
    }
}

// Difference between Array and ArrayList
// ArrayList is a dynamic array, it can be resized, homogeneous and
// heterogeneous elements, load factor 100%, initial capacity 10
// Array is a static array, contain similar data, but cannot be resized, only
// homogeneous elements
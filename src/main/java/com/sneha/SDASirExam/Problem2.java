package com.sneha.SDASirExam;

public class Problem2 {
    public static void main(String[] args) {
        Employee E = new Employee("A", 5632);
        Employee S = new Staff("B", 4500);


        E.info();
        S.info();
    }
}
class Employee {

    String underClass;
    String name;
    int salary;

    Employee(String gname, int gSalary) {
        name = gname;
        salary = gSalary;
        underClass = "Employee";
    }

    void info() {
        System.out.println("\nName of the person : " + name + "\nSalary : " + salary + "\nHe is under " + underClass + " class");
    }
}
class Staff extends Employee {

            Staff(String gname, int gsalary){
                super(gname, gsalary);
                underClass = "Staff";
            }

}

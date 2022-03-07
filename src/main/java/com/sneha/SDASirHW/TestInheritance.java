package com.sneha.SDASirHW;

import java.util.Scanner;
class Person{

    private String name;
    Person(){
        this.name = "Sneha";
    }
    Person(String name){
        this.name = name;
    }
    public void setName(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name:");
        this.name = s.nextLine();
        //System.out.println(this.name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

class Student extends Person{
    private String roll;
    Student(){
        super();
        this.roll = "11";
    }
    Student(String name,String roll){
        super(name);
        this.roll = roll;
    }
    public void setRoll(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student roll:");
        this.roll = s.nextLine();
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getRoll(){
        return this.roll;
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Person p = new Person();
        Person p1 = new Person("SS");
        Student s = new Student();
        Student s1 = new Student("Swara","56");
        System.out.println("Person"+p+"Name is:"+p.getName());
        System.out.println("Person"+p1+"Name is:"+p1.getName());
        System.out.println("Student"+s+"Name is:"+s.getName()+"Roll is:"+s.getRoll());
        System.out.println("Student"+s1+"Name is:"+s1.getName()+"Roll is:"+s1.getRoll());

        p.setName();
        System.out.println("Name is: "+p.getName()+"  Person: "+p);
        s.setRoll();
        System.out.println("Roll is: "+s.getRoll()+"  Student: "+s);
    }

}

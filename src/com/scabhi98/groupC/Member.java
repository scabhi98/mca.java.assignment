package com.scabhi98.groupC;

public class Member {
    private String name, address, contactNumber;
    private int age, salary;

    public Member() {
        age = 0;
        salary = 0;
    }

    public void setData(String name, String address, String contactNumber, int age, int salary) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.age = age;
        this.salary = salary;
    }

    public void printSalary(){
        System.out.println("\nSalary is " + salary);
    }

    public void printData(){
        System.out.println("\nName           :   " + name);
        System.out.println("Age            :   " + age);
        System.out.println("Contact        :   " + contactNumber);
        System.out.println("Address        :   " + address);
    }
}

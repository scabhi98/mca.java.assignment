package com.scabhi98.groupC;

public class Employee extends Member {
    private String specialization;
    Employee(){ }

    public void setData(String name, String address, String contact, String specialization, int age, int salary){
        setData(name, address, contact, age, salary);
        this.specialization = specialization;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Specialization :   " + specialization);
    }
}

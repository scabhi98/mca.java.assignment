package com.scabhi98.groupC;

public class Manager extends Member{
    private String department;

    public void setData(String name, String address, String contact, String department, int age, int salary){
        setData(name, address, contact, age, salary);
        this.department = department;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Department     :   "+department);
    }
}

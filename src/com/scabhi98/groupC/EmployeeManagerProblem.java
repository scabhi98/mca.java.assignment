package com.scabhi98.groupC;

import com.scabhi98.ExecutionEnvironment;
import com.scabhi98.Problem;

public class EmployeeManagerProblem implements Problem {
    private String name, address, contact;
    private int age, salary;
    private Employee emp;
    private Manager mgr;
    public EmployeeManagerProblem(){
        emp = new Employee();
        mgr = new Manager();
    }
    @Override
    public void readInputs() throws Exception {
        System.out.println("\nEnter Data for Employee");
        readEmployee();
        System.out.println("\nEnter Data for Manager");
        readManager();
    }

    private void readBasicInfo() {
        name = ExecutionEnvironment.readInputFor("Name");
        address = ExecutionEnvironment.readInputFor("Address");
        contact = ExecutionEnvironment.readInputFor("Contact");
        age = Integer.parseInt(ExecutionEnvironment.readInputFor("Age"));
        salary = Integer.parseInt(ExecutionEnvironment.readInputFor("Salary"));
    }

    private void readEmployee() throws Exception {
        readBasicInfo();
        String specialization = ExecutionEnvironment.readInputFor("Specialization");
        emp.setData(name,address,contact,specialization,age,salary);
    }
    private void readManager() throws Exception {
        readBasicInfo();
        String department = ExecutionEnvironment.readInputFor("Department");
        mgr.setData(name,address,contact,department,age,salary);
    }

    @Override
    public String getProblemStatement() {
        return "Employee Manager Problem";
    }

    @Override
    public void execute() throws Exception {
        System.out.println("Employee");
        emp.printData();
        emp.printSalary();
        System.out.println("Manager");
        mgr.printData();
        mgr.printSalary();
    }
}
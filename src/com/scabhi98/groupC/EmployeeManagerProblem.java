package com.scabhi98.groupC;

import com.scabhi98.ExecutionEnvironment;
import com.scabhi98.Problem;

import java.io.BufferedReader;

public class EmployeeManagerProblem implements Problem {
    Employee emp;
    Manager mgr;
    public EmployeeManagerProblem(){
        emp = new Employee();
        mgr = new Manager();
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

    @Override
    public void readInputs() throws Exception {
        System.out.println("\nEnter Data for Employee");
        readEmployee();
        System.out.println("\nEnter Data for Manager");
        readManager();
    }

    private void readEmployee() throws Exception {
        String name = ExecutionEnvironment.readInputFor("Enter Name");
        String address = ExecutionEnvironment.readInputFor("Enter Address");
        String contact = ExecutionEnvironment.readInputFor("Enter Contact");
        String specialization = ExecutionEnvironment.readInputFor("Enter Specialization");
        int age = Integer.parseInt(ExecutionEnvironment.readInputFor("Enter Age"));
        int salary = Integer.parseInt(ExecutionEnvironment.readInputFor("Enter Salary"));
        emp.setData(name,address,contact,specialization,age,salary);
    }
    private void readManager() throws Exception {
        String name = ExecutionEnvironment.readInputFor("Enter Name");
        String address = ExecutionEnvironment.readInputFor("Enter Address");
        String contact = ExecutionEnvironment.readInputFor("Enter Contact");
        String department = ExecutionEnvironment.readInputFor("Enter Department");
        int age = Integer.parseInt(ExecutionEnvironment.readInputFor("Enter Age"));
        int salary = Integer.parseInt(ExecutionEnvironment.readInputFor("Enter Salary"));
        mgr.setData(name,address,contact,department,age,salary);
    }
}

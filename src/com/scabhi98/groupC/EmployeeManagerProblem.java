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
        String name = ExecutionEnvironment.readInputFor("Name");
        String address = ExecutionEnvironment.readInputFor("Address");
        String contact = ExecutionEnvironment.readInputFor("Contact");
        String specialization = ExecutionEnvironment.readInputFor("Specialization");
        int age = Integer.parseInt(ExecutionEnvironment.readInputFor("Age"));
        int salary = Integer.parseInt(ExecutionEnvironment.readInputFor("Salary"));
        emp.setData(name,address,contact,specialization,age,salary);
    }
    private void readManager() throws Exception {
        String name = ExecutionEnvironment.readInputFor("Name");
        String address = ExecutionEnvironment.readInputFor("Address");
        String contact = ExecutionEnvironment.readInputFor("Contact");
        String department = ExecutionEnvironment.readInputFor("Department");
        int age = Integer.parseInt(ExecutionEnvironment.readInputFor("Age"));
        int salary = Integer.parseInt(ExecutionEnvironment.readInputFor("Salary"));
        mgr.setData(name,address,contact,department,age,salary);
    }
}

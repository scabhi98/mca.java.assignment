package com.scabhi98.groupA;

import com.scabhi98.ExecutionEnvironment;
import com.scabhi98.Problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StudentMarksheetProblem implements Problem {
    StudentMarksheet students[];
    public StudentMarksheetProblem(){
    }
    @Override
    public String getProblemStatement() {
        return "Student Marksheet of N students.";
    }

    @Override
    public void execute() throws Exception {
        System.out.println("Student Details are:");
        for(StudentMarksheet student : students){
            student.printMarksheet();
        }
    }

    @Override
    public void readInputs() throws Exception {
        int N = Integer.parseInt(ExecutionEnvironment.readInputFor("Number of Students"));
        students = new StudentMarksheet[N];
        for(int i=0; i<N; i++) {
            int roll = Integer.parseInt(ExecutionEnvironment.readInputFor("Roll"));
            String name = ExecutionEnvironment.readInputFor("Name");
            int math = Integer.parseInt(ExecutionEnvironment.readInputFor("Math Marks"));
            int phys = Integer.parseInt(ExecutionEnvironment.readInputFor("Physics Marks"));
            int comp = Integer.parseInt(ExecutionEnvironment.readInputFor("Computer Marks"));
            students[i] = new StudentMarksheet(roll, name, math, phys, comp);
            students[i].generateMarksheet();
        }
    }
}

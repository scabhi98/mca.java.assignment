package com.scabhi98.groupA;

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
//        Scanner scanner = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter number of Students: ");
        int N = Integer.parseInt(br.readLine());
        students = new StudentMarksheet[N];
        for(int i=0; i<N; i++) {
            System.out.print("\nEnter Roll: ");
            int roll = Integer.parseInt(br.readLine());
            System.out.print("\nEnter Name: ");
            String name = br.readLine();
            System.out.print("\nEnter Marks in order (Math, Phys, Comp}: ");
            int math = Integer.parseInt(br.readLine());
            int phys = Integer.parseInt(br.readLine());
            int comp = Integer.parseInt(br.readLine());
            students[i] = new StudentMarksheet(roll, name, math, phys, comp);
            students[i].generateMarksheet();
        }
    }
}

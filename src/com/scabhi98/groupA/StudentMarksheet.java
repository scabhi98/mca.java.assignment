package com.scabhi98.groupA;

public class StudentMarksheet {
    private int roll;
    private int math, phy, comp, total;
    private double avg;
    private String name, grade;

    public StudentMarksheet() {}

    public StudentMarksheet(int roll, String name, int math, int phy, int comp) {
        setStudentDetails(roll, name, math, phy, comp);
    }

    public void setStudentDetails(int roll, String name, int math, int phy, int comp) {
        this.roll = roll;
        this.name = name;
        if(isValid(math, phy, comp)) {
            this.math = math;
            this.phy = phy;
            this.comp = comp;
        }
        else{
            System.out.println("Invalid marks received. Setting to zeros");
            this.math = this.comp = this.phy = 0;
        }
    }

    private boolean isInLimits(int num){
        return (0 <= num && num <= 100);
    }

    public boolean isValid(int math, int phy, int comp){
        return isInLimits(math) && isInLimits(phy) && isInLimits(comp);
    }

    public void generateMarksheet(){
        total = math + phy + comp;
        avg = total / 3.0;
        if(avg >= 50.0){
            if(avg >= 70.0){
                if(avg >= 90.0)
                    grade = "A+";
                else
                    grade = "A";
            }else{
                if(avg >= 60.0)
                    grade = "B+";
                else
                    grade = "B";
            }
        }
        else{
            if(avg >= 30.0)
                grade = "C";
            else
                grade = "D";
        }
    }

    public void printMarksheet(){
        System.out.print(
                "\nRoll:  "+roll + "\nName:  "+name + "\nScore: " + total + "\nGrade: " + grade + "\n"
        );
    }
}

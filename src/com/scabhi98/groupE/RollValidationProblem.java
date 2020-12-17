package com.scabhi98.groupE;

import com.scabhi98.ExecutionEnvironment;
import com.scabhi98.Problem;

public class RollValidationProblem implements Problem {
    private String roll;
    @Override
    public String getProblemStatement() {
        return "Roll Number Validation";
    }

    @Override
    public void execute() throws Exception {
        try{
            InvalidRollException.checkRoll(roll);
            System.out.println("\nRoll Number is: "+roll);
        }catch(InvalidRollException e){
            System.out.println("Exception Caught.");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void readInputs() throws Exception {
        roll = ExecutionEnvironment.readInputFor("Roll");
    }
}
package com.scabhi98.groupA;

import com.scabhi98.ExecutionEnvironment;
import com.scabhi98.Problem;

import java.util.Scanner;

public class PrimeNumbersProblem implements Problem {
    private PrimeNumbers primeNumbers;
    public PrimeNumbersProblem(){
        primeNumbers = new PrimeNumbers();
    }
    @Override
    public String getProblemStatement() {
        return "Prime Number List";
    }

    @Override
    public void execute() throws Exception {
        primeNumbers.printList();
    }

    @Override
    public void readInputs() throws Exception {
        primeNumbers.setRange(
                Integer.parseInt(ExecutionEnvironment.readInputFor("Starting Value")),
                Integer.parseInt(ExecutionEnvironment.readInputFor("Final Value"))
        );
    }
}

package com.scabhi98.groupA;

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
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the Range: ");
        primeNumbers.setRange(
                sc.nextInt(),
                sc.nextInt()
        );
    }
}

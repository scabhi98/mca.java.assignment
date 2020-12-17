package com.scabhi98.groupD;

import com.scabhi98.ExecutionEnvironment;
import com.scabhi98.Problem;

import java.io.IOException;
import java.util.Scanner;

public class CountryCapitalProblem implements Problem {

    String countryFileName, capitalFileName, outputFileName;

    @Override
    public String getProblemStatement() {
        return "Read Country and Capital names and Concatenate them.";
    }

    @Override
    public void readInputs() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Country Filename: ");
        countryFileName = ExecutionEnvironment.FILES_DIR_PREFIX + sc.nextLine();
        System.out.println("Enter Capital Filename: ");
        capitalFileName = ExecutionEnvironment.FILES_DIR_PREFIX + sc.nextLine();
        System.out.println("Enter Country Capital Filename: ");
        outputFileName = ExecutionEnvironment.FILES_DIR_PREFIX + sc.nextLine();
    }

    @Override
    public void execute() throws IOException {
        CountryCapital cc = new CountryCapital(countryFileName, capitalFileName);
        cc.writeTo(outputFileName);
        cc.readFrom(outputFileName);
    }
}

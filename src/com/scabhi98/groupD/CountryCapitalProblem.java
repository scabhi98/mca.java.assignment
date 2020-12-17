package com.scabhi98.groupD;

import com.scabhi98.ExecutionEnvironment;
import com.scabhi98.Problem;

import java.io.IOException;
import java.util.Scanner;

public class CountryCapitalProblem implements Problem {

    private String countryFileName, capitalFileName, outputFileName;

    @Override
    public String getProblemStatement() {
        return "Read Country and Capital names and Concatenate them.";
    }

    @Override
    public void readInputs() throws Exception {
        countryFileName = ExecutionEnvironment.FILES_DIR_PREFIX +
                ExecutionEnvironment.readInputFor("Country Filename");
        capitalFileName = ExecutionEnvironment.FILES_DIR_PREFIX +
                ExecutionEnvironment.readInputFor("Capital Filename");
        outputFileName = ExecutionEnvironment.FILES_DIR_PREFIX +
                ExecutionEnvironment.readInputFor("Output Filename");
    }

    @Override
    public void execute() throws IOException {
        CountryCapital cc = new CountryCapital(countryFileName, capitalFileName);
        cc.writeTo(outputFileName);
        cc.readFrom(outputFileName);
    }
}

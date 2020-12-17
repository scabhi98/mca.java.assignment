package com.scabhi98;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public interface Problem {
    String getProblemStatement();
    void execute() throws Exception;
    void readInputs() throws Exception;
}

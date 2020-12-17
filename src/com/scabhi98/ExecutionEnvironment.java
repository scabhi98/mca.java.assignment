package com.scabhi98;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecutionEnvironment {
    final public static String OUTPUT_DIR_PREFIX = "./out/production/JavaAssignment/com/scabhi98/";
    final public static String FILES_DIR_PREFIX = OUTPUT_DIR_PREFIX + "files/";

    final public static BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

    final public static String readInputFor(String textToPrint){
        System.out.print("\n Enter "+textToPrint + ": ");
        String read = "";
        try {
            read = consoleReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return read;
    }
}

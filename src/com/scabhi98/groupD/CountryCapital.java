package com.scabhi98.groupD;

import java.io.*;
import java.util.Scanner;

public class CountryCapital {

    private Scanner countryScanner, capitalScanner;

    public CountryCapital(String countryFile, String capitalFile) throws IOException {
        countryScanner = new Scanner(new FileInputStream(countryFile));
        capitalScanner = new Scanner(new FileInputStream(capitalFile));
    }

    public String nextCountry(){
        return countryScanner.nextLine();
    }

    public String nextCapital(){
        return capitalScanner.nextLine();
    }

    public void writeTo(String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        while(countryScanner.hasNext() && capitalScanner.hasNext()){
            writer.write(
                    "The Capital of " + nextCountry() + " is " + nextCapital() + "\n"
            );
        }
        writer.flush();
        writer.close();
    }
    public void readFrom(String filename) throws IOException {
        Scanner reader = new Scanner(new FileInputStream(filename));
        while(reader.hasNext()){
            System.out.println(reader.nextLine());
        }
    }
}

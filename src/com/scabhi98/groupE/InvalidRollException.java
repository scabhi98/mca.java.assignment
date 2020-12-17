package com.scabhi98.groupE;

import java.util.regex.Pattern;

public class InvalidRollException extends Exception{

    private static Pattern pattern = Pattern.compile("[\\d]{2}/[a-zA-Z]{2,3}/[\\d]{6}");

    public static boolean isValidRoll(String roll){
        return pattern.matcher(roll).matches();
    }

    public static void checkRoll(String roll) throws InvalidRollException {
        if(!isValidRoll(roll))
            throw new InvalidRollException("Roll number is not Matching with the pattern.");
    }

    public static void setPattern(Pattern pattern) {
        InvalidRollException.pattern = pattern;
    }

    public InvalidRollException(String message){
        super(message);
    }
    public InvalidRollException(){
        super();
    }
}

package com.scabhi98.groupB;

import com.scabhi98.ExecutionEnvironment;
import com.scabhi98.Problem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelCountProblem implements Problem {
    private Map<String, Integer> vowelCountMap;
    private String sentence;

    public VowelCountProblem(){
        this.vowelCountMap = new HashMap<String, Integer>();
    }

    @Override
    public String getProblemStatement() {
        return "Count Vowels in a Sentence";
    }

    @Override
    public void execute() throws Exception {
        Scanner scanner = new Scanner(sentence);
        String maxVowledWord = "";
        int maxVowledCount = 0;
        while(scanner.hasNext()) {
            String token = scanner.next();
            int count = countVowels(token);
            if(count > maxVowledCount){
                maxVowledWord = token;
                maxVowledCount = count;
            }
            vowelCountMap.put(token, count);
        }
        System.out.print("\n Highest vowels count is in word: "+ maxVowledWord + " = "+maxVowledCount);

        System.out.println("\n\n Table of Word Vowel Count:");

        for(Map.Entry<String, Integer> entry: vowelCountMap.entrySet()){
            System.out.printf("\n%32s    :    %d", entry.getKey(), entry.getValue());
        }
    }

    private int countVowels(String word){
        char chars[] = word.toCharArray();
        int sum = 0;
        for(Character c: chars){
            if(isVowel(c))
                sum++;
        }
        return sum;
    }

    private boolean isVowel(Character c){
        if(Character.isLetter(c)){
            char ch = Character.toLowerCase(c);
            return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
        }
        return false;
    }

    @Override
    public void readInputs() throws Exception {
        sentence = ExecutionEnvironment.readInputFor("Sentence");
    }
}

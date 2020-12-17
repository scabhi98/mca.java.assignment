package com.scabhi98;

import com.scabhi98.groupA.PrimeNumbersProblem;
import com.scabhi98.groupA.StudentMarksheetProblem;
import com.scabhi98.groupB.VowelCountProblem;
import com.scabhi98.groupC.EmployeeManagerProblem;
import com.scabhi98.groupD.CountryCapitalProblem;
import com.scabhi98.groupE.RollValidationProblem;
import com.scabhi98.groupF.ProgressBarProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    List<Problem> problems = new ArrayList<Problem>();
	    int problemCount = instantiateProblems(problems);
	    Scanner scanner = new Scanner(System.in);
        int choice;
	    while(true){
            for (int i=0; i<problemCount; i++){
                System.out.print("\n" + (i + 1) + ": " + problems.get(i).getProblemStatement());
            }
            System.out.print("\nChoose: ");
            choice = scanner.nextInt();
            try{
                problems.get(choice - 1).readInputs();

                problems.get(choice - 1).execute();

                if(problems.get(choice - 1) instanceof Cleanup){
                    ((Cleanup) problems.get(choice - 1)).cleanup();
                }

            }catch(IndexOutOfBoundsException e){
                System.out.println("Invalid Choice! Terminating...");
                break;
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }

    private static int instantiateProblems(List<Problem> problems ){
        problems.add( new CountryCapitalProblem() );
        problems.add( new PrimeNumbersProblem() );
        problems.add( new StudentMarksheetProblem() );
        problems.add( new VowelCountProblem() );
        problems.add( new EmployeeManagerProblem() );
        problems.add( new RollValidationProblem() );
        problems.add( new ProgressBarProblem() );

        return problems.size();
    }

}

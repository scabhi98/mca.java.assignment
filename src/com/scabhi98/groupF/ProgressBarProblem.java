package com.scabhi98.groupF;

import com.scabhi98.Cleanup;
import com.scabhi98.ExecutionEnvironment;
import com.scabhi98.Problem;

import javax.swing.*;

public class ProgressBarProblem implements Problem, Runnable, Cleanup {
    private JProgressBar progress;
    private int finalValue, steps, delay;
    private JFrame panel;
    private Thread progressThread;

    public ProgressBarProblem(){
        panel = new JFrame();
        panel.setSize( 480, 320);
        panel.setLayout(null);
    }

    @Override
    public String getProblemStatement() {
        return "Progress Bar Problem";
    }

    @Override
    public void execute() throws Exception {
        progressThread = new Thread(this);

        progress = new JProgressBar(0,finalValue);
        progress.setBounds(10,82, 420, 48);
        progress.setStringPainted(true);
        progress.setValue(0);

        panel.add(progress);
        panel.setVisible(true);

        progressThread.start();
        Thread.sleep(delay * (finalValue / steps + 3));
    }

    @Override
    public void readInputs() throws Exception {
        finalValue = Integer.parseInt(ExecutionEnvironment.readInputFor("Final Value"));
        steps = Integer.parseInt(ExecutionEnvironment.readInputFor("Steps"));
        delay = Integer.parseInt(ExecutionEnvironment.readInputFor("Delay"));
    }

    @Override
    public void run() {
        for(int i = 0; i<=finalValue; i+= steps) {
            progress.setValue(i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void cleanup() {
        panel.dispose();
        progressThread = null;
    }
}

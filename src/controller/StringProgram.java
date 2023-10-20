package controller;

import Repository.StringRepository;

public class StringProgram {

    StringRepository program;

    public StringProgram() {
        program = new StringRepository();
    }

    public void run() {
        System.out.println("===== Analysis String Program ====");
        program.analysisString();
    }
}
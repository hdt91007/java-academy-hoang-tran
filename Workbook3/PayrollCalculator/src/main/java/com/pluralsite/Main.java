package com.pluralsite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
                BufferedReader bufReader = new BufferedReader(new FileReader("src/CSVfile/Payroll.csv"));
            String EmployString;

            while (( EmployString = bufReader.readLine()) != null ){
                System.out.println(EmployString);
            }


        } catch (IOException e) {
            System.out.println("womp womp");
            throw new RuntimeException(e);

        }

    }
}
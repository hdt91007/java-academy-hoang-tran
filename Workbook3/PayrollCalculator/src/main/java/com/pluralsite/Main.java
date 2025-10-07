package com.pluralsite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
                BufferedReader bufReader = new BufferedReader(new FileReader("src/CSVfile/Payroll.csv"));
            String EmployString;
            String[] CsvData //= new String[0]
             ;
            while (( EmployString = bufReader.readLine()) != null ){
                //CsvData = EmployString.trim().split("|");
                System.out.println(Arrays.toString(EmployString.trim().split("|")));
                String EmployeeInfo = EmployString;
                System.out.println(EmployeeInfo);
            }

        } catch (IOException e) {
            System.out.println("womp womp");
            throw new RuntimeException(e);
        }

    }
}
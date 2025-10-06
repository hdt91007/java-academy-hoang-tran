package com.pluralsite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("Payroll2.txt"));
            String input;
            // read until there is no more data
            while ((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }
            // close the stream and release the resources
            bufReader.close();
//        } catch (IOException e) {
//            System.out.println("womp womp");
//
//
//            //Employee;
//        }
    }
}
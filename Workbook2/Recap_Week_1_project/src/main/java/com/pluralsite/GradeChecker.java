package com.pluralsite;

import java.util.Scanner;

public class GradeChecker {

    public static void main(String[] args) {

        //declare variables here

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your grade as a number");
        int Grade = scanner.nextInt();

        if (100 > Grade && Grade < 0   ) {
            System.out.println("Invalid response Try again");
        // code a loop
        }

        else if (100 >= Grade && Grade >= 90) {
            System.out.println("You got an A");

        }
        else if (89 >= Grade && Grade >= 80) {
            System.out.println("You got an B");}
        else if (79 >= Grade && Grade >= 70) {
            System.out.println("You got an C");}
        else if (69 >= Grade && Grade >= 60) {
            System.out.println("You got an D");}
        else if ( 59 >= Grade && Grade >= 0) {
            System.out.println("You got an F");}
        else {
            System.out.println("Womp womp code issue");

        }

    }

}

//🎯 Mini Project: Simple Grade Checker
//        Objective
//Practice:
//Declaring and using variables
//Taking user input with Scanner
//Applying if-else conditions
//Project Description
//Write a program that:
//Asks the user to enter their exam score (0–100).
//Stores the score in a variable.
//Uses if-else conditions to determine the grade:
//        90–100 → "A"
//        80–89 → "B"
//        70–79 → "C"
//        60–69 → "D"
//Below 60 → "F"
//Prints the grade back to the user.
//        Example result
//Enter your exam score (0-100): 92
//Your grade is A
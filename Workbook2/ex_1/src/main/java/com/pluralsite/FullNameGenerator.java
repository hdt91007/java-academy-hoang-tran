package com.pluralsite;

import java.util.Scanner;

public class FullNameGenerator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Plesase enter your Name Below");
        System.out.println("Type out your first Name");
        String firstname = scan.next().trim();

        System.out.println("Type out your Middle name or enter N/A");
         String middlename = scan.next().trim();
        if (middlename.equalsIgnoreCase("N/A")) {
            middlename = "";
        }
        System.out.println("Type out your Last name");
        String Lastname = scan.next().trim();

        System.out.println("Type out your Suffix or enter N/A");
         String Suffix = scan.next().trim();

        if (middlename.equalsIgnoreCase("N/A")) {
            middlename = "";
        }
        if (Suffix.equalsIgnoreCase("N/A")) {
            Suffix = "";
        }


        System.out.printf(firstname);


        if (!middlename.isEmpty()) {
            System.out.printf(" " + middlename);
        }
        if (!Lastname.isEmpty()) {
            System.out.printf(" " + Lastname);
        }
        if (!Suffix.isEmpty()) {
            System.out.printf(", " + Suffix);
        }


    }
}
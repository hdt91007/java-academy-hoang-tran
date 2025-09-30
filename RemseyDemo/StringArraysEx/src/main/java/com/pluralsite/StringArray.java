package com.pluralsite;

import java.util.Scanner;

public class StringArray {


    public static void main(String[] args) {


        System.out.println("=== STRINGS ===");

        String name = "Remsey";
        System.out.println("Hello, " + name); // Concatenation

// String methods
        System.out.println("Length of name: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("LowercASE: " + name.toLowerCase());
        System.out.println("First letter: " + name.charAt(0));   //R
        System.out.println("Does it contain 'sey'? " + name.contains("sey")); //true or false


        String MovieTitle = "Diabolic Crisis";
        System.out.println(MovieTitle.toUpperCase());

        // While loop
        System.out.println("\nPassword is incorrect:");
        Scanner read = new Scanner(System.in);

        boolean passwordIncorrect;
        String password = "1234";
        String enterPassword = "";

        while (!enterPassword.equals(password)) {
            System.out.println("What is the password?");
            enterPassword = read.nextLine();
            if(!enterPassword.equals(password))
                System.out.println("inccorect");;



        }

    }
    }
}


package com.pluralsite;

import java.util.Scanner;

public class SandwichShop {
    public static double discount = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double price = 0;

        System.out.println("Type if you would want a Small sandwich or Large sandwich");
        String SandwichSize = scanner.nextLine();
        System.out.println("Type yes or no if would you like your sandwich to be loaded");
        String loaded = scanner.nextLine();

        System.out.println("Type out your to see if you qualify for a discount");
        int Age = scanner.nextInt();
        if (Age <= 17) {
            discount = .10;
            System.out.println("your discount is 10% ");
        }
        else if (Age >= 65) {
            discount = .20;
            System.out.println("your discount is 20%");
        }


        //Why do you cant you create a varaible inside an if
        if (SandwichSize.equals("Small")) {
            if (loaded.equals("Yes"))
            {
                price = 6.45;
            }
            else
                price = 5.45;
        }

    //Why doesnt this work *else if (SandwichSize == "Large")*
        if (SandwichSize == "Large")
        else if (SandwichSize.equals("Large")) {
            if (loaded.equals("Yes"))
            {
                price = 10.70;
            }
            else{
                price = 8.95;
            }
        }
    double total = price*(1-discount);

            System.out.println("Your total for a " + SandwichSize + " Sandiwich is $" + String.format("%.2f",(total)));



}
}

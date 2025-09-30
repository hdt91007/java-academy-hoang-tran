package com.pluralsite;

import java.util.Scanner;

public class MoragageCalculator {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("what's your loan");
        double loan = scanner.nextFloat();
        System.out.println("whats your interest rate");
        double interest = scanner.nextFloat();
        System.out.println("How many years is your loan");
        double time  = scanner.nextFloat();

        double months = time * 12;
        double deci_interest = interest/100/12;


        double morage = loan *deci_interest* (Math.pow((1+deci_interest),(time*12)))/(Math.pow((1+deci_interest),(time*12))-1);
        double interesttotal = morage*months - loan;
        //Monly payment  = Principl/down × (annual interest * (1 + annual interest )^number of monthly payments / ( (1 + annual interest)^number of monthly payments ) - 1)

        System.out.println("A $"+ loan+" loan at "+ interest+ "% interest for "+time+" years would have a $"+ (Math.round(morage*100))/100 + "/mon with a total interest of $"+ (Math.round(interesttotal*100))/100);




    }
}
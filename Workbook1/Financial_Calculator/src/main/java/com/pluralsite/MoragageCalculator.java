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


//      asdom

         //
         //
         //
         //
         //
         //
         //
         //
         //
         //



    }
}
// Variables for Loan interest and years overall interest principal/downpayemnet
// M P R Y N I


//
//M = P × (i * (1 + i )^n / ( (1 + i)^n ) - 1)
// moragage =  downpayment * (monthly interest * (1 + monthly interest))^number of monthly payments / ((1 + monthly interest)^number of monthly payments ) -1 )
//Calculator 1: A mortgage calculator - it is used to calculate out
//how much a monthly payment for a loan would be (minus any
//insurance or taxes), as well as how much interest you would pay
//over the life of the loan.
//a. It would accept the principal, interest rate, and loan length
//from the user
//b. It would display the expected monthly payment and total
//interest paid
//Example: A $53,000 loan at 7.625% interest for 15 years would
//have a $495.09/mo payment with a total interest of $36,115.99
//This calculator would use a compounded interest formula.
//Monly payment  = Principl/down × (annual interest * (1 + annual interest )^number of monthly payments / ( (1 + annual interest)^number of monthly payments ) - 1)
//        • Monthly Payment (M) =
//o Principal (P):
//        - This is the total amount of the loan.
//o Annual Interest Rate (r):
//        - The nominal annual interest rate in decimal form.
//        (e.g. 7.625% = 0.07625)
//o Loan Term in Years (y):
//        - How many years the loan lasts.
//o Number of Monthly Payments (n):
//        - This is 12 × y (Because there are 12 monthly payments per year.)
//o Monthly Interest Rate (i):
//        - This is the annual interest rate divided by 12, i.e. r/12
//        • Total Interest = (M×n)−P
//
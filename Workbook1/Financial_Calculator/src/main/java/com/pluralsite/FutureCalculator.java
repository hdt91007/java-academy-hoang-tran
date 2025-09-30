package com.pluralsite;

import java.util.Scanner;

public class FutureCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("what is the intial deposit");
        Double deposit = scanner.nextDouble();
        System.out.println("what is the the interest rate deposit");
        Double futinterest = scanner.nextDouble();
        System.out.println("how many years do you want to hold");
        Double years = scanner.nextDouble();

         double roundfutinterest = (Math.round(futinterest*100));
         double Decimal_Interest = roundfutinterest/100;
        System.out.println("interest is "+Decimal_Interest+ "%");
       Double total = deposit * Math.pow((1 + (Decimal_Interest/100 / 365)), (365 * years));
        System.out.println(total);
        Double Interest_Gain = total- deposit;
        System.out.println(Interest_Gain);
    }
}


//Calculator 2: A calculator that determines the future value of a
//one-time deposit assuming compound interest - it is used to help
//you decide how much a CD will be worth when it matures
//a. It would accept the deposit, interest rate, and number of
//years from the user
//b. It would display the future value and the total interest
//earned
//Example: If you deposit $1,000 in a CD that earns 1.75%
//interest and matures in 5 years, your CD's ending balance will
//be $ 1,091.44 and you would have earned $91.44 in interest
//Note: The numbers above assume daily compounding
//FV = P × (1 + (r / 365) )^(365 × t)
//        • Future Value (FV) =
//o Principal (P):
//        - This is the initial deposit amount.
//o Annual Interest Rate (r):
//        - The nominal annual interest rate in decimal form.
//        (e.g., 1.75% = 0.0175).
//o Number of Years (t):
//        - The total number of years the deposit will earn interest.
//o Days Per Year:
//        - Daily compounding assumes 365 days per year.
//o Total Number of Days:
//        - This is 365 × t (because there are 365 days per year).
//        • Total Interest Earned = FV - P
//
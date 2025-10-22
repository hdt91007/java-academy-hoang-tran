package com.pluralsite;

import java.util.Scanner;

public class debug {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            int results = number * 2;


            System.out.println("Double of number is: " + results); // variable error
            if (number > 0) { // logical error
                System.out.println("The number is positive.");}
                else {
                    System.out.println("number is negative");
                }
            }
        }
//date time description vendor amount formate
//todo Make a CLI application
//todo track financial in and out


//prompt what they want to do

// D for deposit
// ask for date,time,description,vendor amount
// take all the information then add it into txt


// L Ledger

//P Make payment
//filter through information for negative value
//after selecting


//Sort ledger by most recent datetimeformat
//Ask for key values to examine All, Deposits,Payments, Or sub search for values
// Filter out all values leaving Deposits
//Filter out all values leaving Payments
//Filer out all values leaving  Everythign

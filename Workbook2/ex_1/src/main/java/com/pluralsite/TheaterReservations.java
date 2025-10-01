package com.pluralsite;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter your name below");
        String Names = scan.nextLine();
        //Use Name parser to reform

        System.out.println("What date do you want to reserve in (MM/dd/yyyy) format");
        String Date = scan.nextLine();
        //Date = DateTimeFormatter.ofPattern(" MMM dd yyyy");

        System.out.println("How many ticket would you like?");
        int tickets = scan.nextInt();






    }
    }

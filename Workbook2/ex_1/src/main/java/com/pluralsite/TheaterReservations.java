package com.pluralsite;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TheaterReservations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Please enter your name below");
        String Names = scan.nextLine();
        //Use Name parser to reform
        //FullNameParser parser = new FullNameParser();
        String Name = FullNameParser.LastnameFirstnameFormat(Names);

        //Needs more work to get date format working
        System.out.println("What date do you want to reserve in (MM/dd/yyyy) format");
        String Date = scan.nextLine();
        java.time.format.DateTimeFormatter DateFormat;
        DateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate.parse(Date, DateFormat);

        System.out.println(Date);

        System.out.println("How many ticket would you like?");
        int tickets = scan.nextInt();

        if (tickets == 1) {
            System.out.println(tickets + " ticket reserved for " + Date + " under " + Name);
        } else {
            System.out.println(tickets + " tickets reserved for " + Date + " under " + Name);


        }
    }
}

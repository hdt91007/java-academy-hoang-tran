package com.pluralsite;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void Validateemail(String Email) {
        int atsign = Email.indexOf("@");
        if (Email.substring(atsign + 1).equalsIgnoreCase("yearup.org"))
            System.out.println("Method 1 worked");
        else {
            System.out.println("wrong domain");

        }

    }

        public static void main (String[]args){
            Validateemail("jimmyjohn@yearup.OrG");
            Validateemail("jimmyjohn@year234.org");

            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String Format_Date = now.format(Format);
            System.out.println(Format);
        } //end of code


        }


package com.pluralsight;


import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CellPhone tomphone  = new CellPhone(1231, "", "","","");
        tomphone.getCarrier();
        tomphone.getModel();
        tomphone.getSerialNumber();
        tomphone.getOwner();
        System.out.println(tomphone.getPhonNumber());
        System.out.println("Step 2");

        System.out.println("What is the serial number");
        tomphone.setSerialNumber(scan.nextInt());
        System.out.println("What model is the phone");
        tomphone.setModel(scan.nextLine());
        System.out.println("Who is the carrier");
        tomphone.setCarrier(scan.nextLine());
        System.out.println("What is the phone number");
        tomphone.setphonNumber(scan.nextLine());
        System.out.println("Who is the owner of the phone");
        tomphone.setOwner(scan.nextLine());


        System.out.println("\n" +
                "- serial Number = " + tomphone.getSerialNumber() + "\n"+
                "- model = " + tomphone.getModel() + "\n"+
                "- carrier = " + tomphone.getCarrier() + "\n"+
                "- phoneNumber = " + tomphone.getPhonNumber() + "\n"+
                "- owner = " + tomphone.getOwner() + "\n"
        );





            }

    }

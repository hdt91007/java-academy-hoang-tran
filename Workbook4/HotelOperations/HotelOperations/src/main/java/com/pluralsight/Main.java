package com.pluralsight;

public class Main {
    public static void main(String[] args) {
 Employee Josh = new Employee(1233,"Josh","Vallet",24.00);
 Josh.setHoursWorked(100.00);

        System.out.println("if josh works for "+Josh.getHoursWorked()+ " hours then he would earn "+Josh.getTotalpay());

        System.out.println(24*40);
        System.out.println(24*1.5*60);
        Reservation Wellot = new Reservation();
        Wellot.getReservationtotal();

        }
    }
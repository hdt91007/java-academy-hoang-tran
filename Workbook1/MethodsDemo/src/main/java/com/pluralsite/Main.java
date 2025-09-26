package com.pluralsite;


public class Main {



        public static void Doubleager ( int age){
            System.out.println("double the age of "+ age +" is " + age* 2);
        }
        public static void Retirement ( int age){
            if (65 - age > 0) System.out.println("at "+ age + " if you retire at 65 you have " + (65 - age) + " more years");
            else {
                System.out.println("Congrats grampa you've retired time");
            }

        }
    public static void main(String[] args) {

        Doubleager(23);
        Retirement(54);

    }

}
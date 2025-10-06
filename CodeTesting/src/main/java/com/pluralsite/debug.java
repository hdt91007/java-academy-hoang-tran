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

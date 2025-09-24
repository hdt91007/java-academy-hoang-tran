package com.pluralsite;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(" the richee speed run goes crazy ");
        //Primitive variables
        int age = 24;
        String favartist = "Shishishishi";
        String colour = "Blue";
        String firstname = "Hoang";
        String lastname = "Tran";
        System.out.println("My name is " + firstname + " " + lastname);
        System.out.println("My favorite artist is " + favartist);
        System.out.println("My favorite color is " + colour);
        System.out.println("I am " + age + "years old");

        boolean Eatyet = false;
        boolean ishappy = true;
        if (Eatyet == true) {
            System.out.println("I already ate");
        }
        else System.out.println("Not yet ");

        if (Eatyet && ishappy) {
            System.out.println(" thats good");
        }
        else if (!Eatyet && !ishappy) {
            System.out.println(" you could be unhappy cause hungry");
        }
        else if (Eatyet && !ishappy) {
            System.out.println(" atleast your not hungry");
            }
        else {
            System.out.println(" your happy but you should eat");

        }

        }

    }
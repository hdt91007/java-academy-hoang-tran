package com.pluralsite;

public class ex_cats {
    public static void main(String[] args) {
        System.out.println("so");
        boolean isSleeping = false;
        boolean isPurring = true;

        //○ a cat’s name, age, color, and weigh
        String Cname = "Cici";
        int Cage = 4;
        double Cweight =  5.4;
        System.out.printf(Cname);
        System.out.printf(" is a ");
        System.out.printf(String.valueOf(Cage));
        System.out.printf(" year old ");
        String ccolor = "white";
        System.out.printf(ccolor);
        System.out.printf(" who weighs ");
        System.out.println(String.valueOf(Cweight));

        System.out.println( Cname+ " is a " + Cage+ " year old " + ccolor + " who weighs " + Cweight + "k.g");
        Boolean ishungry = true;
        if (ishungry) {
            System.out.println("The cat is meowing for food!");
        } else {
            System.out.println("The cat is full and purring.");
        }

    }
}

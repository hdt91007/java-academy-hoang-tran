package com.pluralsight;

import java.util.ArrayList;

public class Saiyan {
        //instance variables unique to all saiyans
        private String name;
        private int powerlevel;
        //static variables shared by all variables
        private static int totalSaiyans = 0;





        static ArrayList<Saiyan> allSaiyans = new ArrayList<>();

    static void fusionDance(Saiyan s1, Saiyan s2) {
        System.out.println(s1 + " and " + s2 + " fused into Gogeta!");
    }

    public void setPowerlevel(int powerlevel) {
            if (powerlevel > 0) {
                this.powerlevel = powerlevel;
            }
        }
        //
        public Saiyan(String name, int powerlevel) {
            this.name = name;
            this.powerlevel = powerlevel;
            allSaiyans.add(this);
            totalSaiyans++;

        }

        public static void showTotalSaiyans() {
            System.out.println("There are a total of " + totalSaiyans + " saiyans");
        }

        public void getPowerlevel() {
            System.out.println(powerlevel);
        }
    //Show stats of Goku
    public void showStats() {
        //non-static is values that belongs to the object
        // static measn generic information not a particilar saiyan or object.

        System.out.println("Name: " + this.name);
        System.out.println("Powerlevel: " + this.powerlevel);
    }

    public static void showAllSaiyansStats() {
        for (Saiyan s : allSaiyans) {
            s.showStats();
        }
    }
    }



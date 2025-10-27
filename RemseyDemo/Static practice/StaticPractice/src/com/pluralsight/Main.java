package com.pluralsight;

public class Main {
    public static void main(String[] args) {

Saiyan s1 = new Saiyan("Broly", 9000);
Saiyan s2 = new Saiyan ("Brock", 9000);
Saiyan s3 = new Saiyan("Mort", 1000000);
Saiyan s4 = new Saiyan("Mario", 1001);
Saiyan s5 = new Saiyan("Kakarot", 1001);
Saiyan s6 = new Saiyan("Kakarot", 1001);
Saiyan.showAllSaiyansStats();
Saiyan.fusionDance(s1,s2);

//static method is not connected to 1 Saiyan
        //
    }
}
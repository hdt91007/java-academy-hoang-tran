package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//todo: Create a powerpuff girls fighting game
        //features
        //PLay online, play solo

        //Customizing Characters
        //Costumes
        //health
        //damage
        //dialogue


        PowerpuffGirl Blossom = new PowerpuffGirl("Blossom","Pink" );
        System.out.println(1.);
        System.out.println(Blossom.getHealth());
        System.out.println(2.);
        Blossom.Heal(40);
        System.out.println(Blossom.getHealth());
        Blossom.setHealth(-10);
        System.out.println(3.);
        Blossom.setHealth(30);
        System.out.println(4.);
        Blossom.Heal(5);

        }
    }

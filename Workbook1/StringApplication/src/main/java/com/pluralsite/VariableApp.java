package com.pluralsite;


import java.security.KeyStore;
import java.time.DayOfWeek;

public class VariableApp {
    public static void main(String[] args) {
        String Favoritecolor = "blue";
        int YUUYear = 2025;
        char MiddleInital = 'D';
        boolean Havepets = true;
        String NiceMessage = "I hope your having a good day";
        System.out.println(Favoritecolor + " is my favorite color");
        System.out.println(Favoritecolor + " I started year up united in " + YUUYear);
        System.out.println("Those with the Middle name " + MiddleInital + " will change the world");
        if (Havepets == false) System.out.println("I dont have a pet");
        else System.out.println("I have a dog");

        System.out.println(NiceMessage);
        //Declare AND initialize variables for:
        //2. The number of days in a week
        //3. The price of coffee ($4.99)
        //4. Your favorite letter
        //5. Whether it's raining (true/false)
        //6. Print all values in complete sentences

        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);d
        int Daysinaweek = 7;
        double coffeeprice = 4.99;
        char FavoriteLetter = 'R';
        boolean Raing = false;
        System.out.println("there are " + Daysinaweek + " days in a week.");
        System.out.println("the price of coffee is $" + coffeeprice + ".");
        System.out.println("My favorite letter is " + FavoriteLetter+ ".");
        if (Raing == true) System.out.println("Oh noi! it's rain!");
        else System.out.println("Wow what clear skies!");



    }
}

package com.pluralsite;

public class Ex_Movie {
    public static void main(String[] args) {
        //Movie title (String)
        String Movie_title = "RRR";
        //Number of friends (int)
        int Number_of_Friends = 12;
        //Pizza price per piece (double)
        double Pizzaperprice = 8.99;
        //Whether you have popcorn (boolean)
        boolean havepopcorn = true;
        //Print a short plan for your movie night.
        if (Movie_title=="RRR") System.out.println("Lets go to movie and watch " + Movie_title);
        else System.out.println("no interesting movies atm cause they arent showing " + Movie_title);
        System.out.println("We're going to need "+ (Number_of_Friends + 1 )+ " tickets for " + Movie_title);
        //could do a ticket number variable but ehh
        if (havepopcorn) System.out.println("Good on popcorn for the moveie");
        else System.out.println("Need to buy popcorn");
        //Calculate and print the total pizza cost (include yourself).
        double Pizza_Total = Pizzaperprice * (Number_of_Friends + 1);
        System.out.println("The Price for pizza was $" + Pizza_Total);
        double roundedPizzaprice = Math.round(Pizza_Total);
        System.out.println("rounded price is about " + roundedPizzaprice);

        if(roundedPizzaprice > 30) System.out.println("Whoa, that's a lot of pizza! 🍕");
        else System.out.println("Nice budget-friendly movie night!");

        double drinkprice = 3.49;


    }
}

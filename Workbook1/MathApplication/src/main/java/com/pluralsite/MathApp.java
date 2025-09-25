package com.pluralsite;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables here
        // then code solution
        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        double Bobsalary = 2319313;
        double Garysalary = 1232144;

        double highestsalary = Math.max(Bobsalary, Garysalary);
        System.out.println(" :o The highest salary between Gary and Bob is $" + highestsalary);

        double Truckprice = 54769.12;
        double carprice = 65492.86;
        double lowestprice = Math.min(Truckprice,carprice);
        System.out.println("The cheaper vehicle cost is $" + lowestprice);
        double Radius = 23.3;
        double AreaofCircle = Math.PI * (Radius * Radius);
        System.out.println("The area of a circle with a radius of " + Radius + "inches is "+ AreaofCircle);
        //4. Find and display the square root a variable after it is set to 5.0
        double presquarevariable = 5;
                double root = Math.sqrt(presquarevariable);
        System.out.println(presquarevariable);
                double negvalue = -3.8;
        //5. Find and display the distance between the points (5, 10) and (85, 50)
        //treat it like a triangle 80 sideways 40 up
                int vert1 = 5;
                int vert2 = 85;
                int hor1 = 10;
                int hor2 = 50;
                int hordis = hor2 - hor1;
                int vertdis = vert2 - vert1;
                double distance = Math.sqrt(Math.pow(hordis,2) + Math.pow(vertdis,2));
        System.out.println("the distance between the point 5,10 and 85,50 is " + Math.round(distance*100)*0.01);
         double neg2 = Math.abs(negvalue);
        System.out.println(neg2);
        System.out.println(Math.round(Math.random()*100)*.01);


        //8. Calculate how many minutes are in 24 days, use a variable for each value you
        //calculate with. BONUS: How many milliseconds?
        int minutesinanhour = 60;
        int hourinaday =24;
        int milisecondsinasecond = 1000;
        int secondsinaminute = 60;
        int daysin24days=24;
        int minutesin24days = daysin24days * hourinaday * minutesinanhour;
        System.out.println("In 24 days there are " + minutesin24days + " minutes");
        System.out.println("Alternatively in 24 days there are " + (minutesin24days * secondsinaminute * milisecondsinasecond) + " miliseconds");


    }
}

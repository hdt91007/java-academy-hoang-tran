package com.pluralsight;

public class Room {
    private static int NumberOfBeds;
    private double Price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;


    public int getNumberOfBeds(){
        return NumberOfBeds;

    }
    public double getPrice(){
        return Price;
    }
    public  boolean isOccupied(){
        return isOccupied;
    }
    public boolean isDirty(){
        return isDirty;
    }
    public boolean isAvailable(){
        return isAvailable;

    }

}

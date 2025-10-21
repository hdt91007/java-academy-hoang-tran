package com.pluralsight;

public class Room {
    private static int NumberOfBeds;
    private double Price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    public Room(double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        Price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

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
    public void checkin (){
        if (isDirty()) {
            System.out.println("Failed to book room. cleaning staff must come before room is avaliable");
        }
        else {
            this.isAvailable = false;
            this.isDirty = true;
        }
    }
    public void checkout(){
 this.isAvailable = true;
 this.isOccupied = false;
    }
    public void cleanroom() {
this.isAvailable = true;
this.isDirty = false;
        System.out.println("Cleaning staff has cleaned out the room, Ready for next booking");
    }
}

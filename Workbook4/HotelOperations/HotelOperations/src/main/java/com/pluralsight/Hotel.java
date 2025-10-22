package com.pluralsight;

public class Hotel {
    private String Roomtype;
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;
    private boolean isSuite;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRoomsBooking, boolean isSuite) {
        if (isSuite) {
            if (numberOfRoomsBooking > numberOfSuites - bookedSuites) {
                System.out.println("not enough suites");
                return false;
            } else

                return true;
        } else {
            if (numberOfRoomsBooking > numberOfRooms - bookedBasicRooms) {
                System.out.println("not enough basicRooms");
                return false;
            } else
                bookedBasicRooms = bookedBasicRooms + numberOfRoomsBooking;
            return true;

        }
    }

    public int getAvaliableSuites() {
        int avaliableSuites = numberOfSuites - bookedSuites;
        System.out.println("there are "+avaliableSuites+" Suites available at the moment.");
        return avaliableSuites;
    }
    public int getAvaliableRooms() {
        int avaliablerooms = numberOfRooms - bookedBasicRooms;
        System.out.println("there are "+avaliablerooms+" Basic Rooms available at the moment.");

        return avaliablerooms;
    }
}

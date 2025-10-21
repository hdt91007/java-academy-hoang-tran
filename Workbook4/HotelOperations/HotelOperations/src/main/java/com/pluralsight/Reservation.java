package com.pluralsight;

public class Reservation {


    private String RoomType;
    private Double Price;
    private int NumberOfNights;
    private boolean isWeekend;



    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public Double getPrice() {
        if (this.RoomType.equalsIgnoreCase("King")) {
            this.Price = 139.00;
        } else {
            this.setPrice(124.00);
        }

        return Price;
    }


    public void setPrice(Double price) {
        Price = price;
    }

    public int getNumberOfNights() {
        return NumberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        NumberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationtotal() {
        if (isWeekend() == true) {
            this.Price = this.Price * 1.10*getNumberOfNights();
        }
        return Price;
    }
}

package com.kkkwid.comprehensive.domain;

import java.io.Serializable;

public class Seat implements Serializable {
    private int seatNumber;
    private boolean isOccupied;
    private String userId;

    public Seat(int seatNumber) {
        this.seatNumber = seatNumber;
        this.isOccupied = false;
        this.userId = "";
    }

    public int getSeatNumber() { return seatNumber; }
    public boolean isOccupied() { return isOccupied; }
    public String getUserId() { return userId; }

    public void occupy(String userId) {
        this.isOccupied = true;
        this.userId = userId;
    }

    public void vacate() {
        this.isOccupied = false;
        this.userId = "";
    }
}


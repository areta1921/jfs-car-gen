package com.example.car_gen;

public class Lexus extends Car {
    private boolean hasLeatherSeats;

    public Lexus(){
        super("silver", 2020, 220);
    }

    //getter
    public boolean getHasLeatherSeat(){
        return this.hasLeatherSeats;
    }
    //Setter
    public void setHasLeatherSeats(boolean hasLeatherSeats){
        this.hasLeatherSeats = hasLeatherSeats;
    }
}

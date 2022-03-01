package com.example.car_gen;

public class Honda extends Car {
    private boolean isTurboCharged;

    public Honda(){
        super("black", 2022, 180);
    }

    //Getter
    public boolean getIsTurboCharger(){
        return this.isTurboCharged;
    }
    public void setTurboCharged(boolean isTurboCharged){
        this.isTurboCharged = isTurboCharged;
    }
}

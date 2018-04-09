package com.company;

/**
 * Created by Макс on 09.04.2018.
 */
public class Aircraft extends Transports {
    private int numberOfPassengers;

    public Aircraft(String model, double fuelConsumption, int numberOfPassengers){
        super(model, fuelConsumption);
        if (numberOfPassengers >= 0)this.numberOfPassengers = numberOfPassengers;
        else this.numberOfPassengers = 0;

    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void go(int km){
        super.go(km);
        this.fuelAmount = this.fuelAmount + km * (this.fuelConsumption / 100);
        this.fuelAmount = this.fuelAmount - km * (this.fuelConsumption * ( 1 + 0.01 * this.numberOfPassengers) / 100);
    }
}

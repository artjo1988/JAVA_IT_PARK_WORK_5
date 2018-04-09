package com.company;

/**
 * Created by Макс on 09.04.2018.
 */
public class Motorbike extends Transports{
    private boolean sportBike;

    public Motorbike(String model, double fuelConsumption, boolean sportBike) {
        super(model, fuelConsumption);
        this.sportBike = sportBike;
    }

    public boolean isSportBike() {
        return sportBike;
    }

    public void go(int km){
        super.go(km);
        this.fuelAmount = this.fuelAmount + km * (this.fuelConsumption / 100);
        if (this.sportBike == true)
            this.fuelAmount = this.fuelAmount - km * (this.fuelConsumption * 1.3 / 100);
        else
            this.fuelAmount = this.fuelAmount - km * (this.fuelConsumption / 100);

    }
}

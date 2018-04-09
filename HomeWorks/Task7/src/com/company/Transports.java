package com.company;

import sun.rmi.transport.Transport;

/**
 * Created by Макс on 09.04.2018.
 */
public class Transports {
    protected String model;
    protected int mileage;
    protected double fuelConsumption;
    protected double fuelAmount;

    public Transports(String model, double fuelConsumption){
        this.model = model;
        if(fuelConsumption > 0)this.fuelConsumption = fuelConsumption;
        else if(fuelConsumption <= 0) this.fuelConsumption = 0;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void addFuel(double fuel){
        this.fuelAmount += fuel;
    }

    public void go (int km){
        this.mileage += km;
        this.fuelAmount = this.fuelAmount - km * (this.fuelConsumption / 100);
    }
}


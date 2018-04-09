package com.company;

/**
 * Created by Макс on 09.04.2018.
 */
public class Car extends Transports {
    private double nitrousOxideConsumption;
    private double nitrousOxideAmount;

    public Car(String model, double fuelConsumption, double nitrousOxideConsumption) {
        super(model, fuelConsumption);
        if(nitrousOxideConsumption > 0) this.nitrousOxideConsumption = nitrousOxideConsumption;
        else if(nitrousOxideConsumption <= 0) this.nitrousOxideConsumption = 0;
    }

    public double getNitrousOxideConsumption() {
        return nitrousOxideConsumption;
    }

    public double getNitrousOxideAmount() {
        return nitrousOxideAmount;
    }

    public void addAllFuel (double fuel, double nitrousOxideFuel){
        super.addFuel(fuel);
        this.nitrousOxideAmount += nitrousOxideFuel;
    }

    public void go(int km){
        super.go(km);
        if((this.nitrousOxideAmount = this.nitrousOxideAmount - km * (this.nitrousOxideConsumption / 100)) < 0 )this.nitrousOxideAmount = 0;
        else this.nitrousOxideAmount = this.nitrousOxideAmount - km * (this.nitrousOxideConsumption / 100);
    }
}

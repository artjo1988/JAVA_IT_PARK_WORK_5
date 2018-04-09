package com.company;

/**
 * Created by Макс on 09.04.2018.
 */
public class Tank extends Transports {
    private int ammunition;

    Tank(String model, double fuelConsumption, int ammunition){
        super(model, fuelConsumption);
        if(ammunition <= 1500 && ammunition >=0) this.ammunition = ammunition;
        else if(ammunition > 1500) this.ammunition = 1500;
        else this.ammunition = 0;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public void go(int km){
        super.go(km);
        this.fuelAmount = this.fuelAmount + km * (this.fuelConsumption / 100);
        if(this.ammunition >= 500 && this.ammunition <= 1500){
            this.fuelAmount = this.fuelAmount - km * (this.fuelConsumption / 100);
        }
        else if(this.ammunition < 500 && this.ammunition > 100) {
            this.fuelAmount = this.fuelAmount - km * (this.fuelConsumption * 0.85 / 100);
        }
        else {
            this.fuelAmount = this.fuelAmount - km * (this.fuelConsumption * 0.75 / 100);
        }
    }
}

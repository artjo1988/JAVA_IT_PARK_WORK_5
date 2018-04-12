package com.company;

/**
 * Created by Макс on 12.04.2018.
 */
public class Square extends Figures {

    public Square(double a) {
        super(a);
    }

    @Override
    public void are() {
        System.out.println("Площадь квадрата: " + (this.getA() * this.getA()));
    }
}

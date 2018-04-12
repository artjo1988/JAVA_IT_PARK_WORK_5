package com.company;

/**
 * Created by Макс on 12.04.2018.
 */
public class Ellipse extends Figures {

    public Ellipse(double a, double b) {
        super(a, b);
    }

    @Override
    public void are() {
        System.out.println("Площадь эллипса: " + (3.14 * this.getA() * this.getB()));
    }
}

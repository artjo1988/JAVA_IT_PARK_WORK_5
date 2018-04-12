package com.company;

/**
 * Created by Макс on 12.04.2018.
 */
public class Triangle extends Figures {

    public Triangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public void are() {
        double p = ( this.getA() + this.getB() + this.getC()) / 2;
        double s = Math.sqrt(p * (p - this.getA()) *(p - this.getB()) * (p - this.getC()));
        System.out.println("Площадь треугольника: " + s);
    }
}

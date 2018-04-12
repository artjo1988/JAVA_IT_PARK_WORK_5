package com.company;

/**
 * Created by Макс on 12.04.2018.
 */
public class Rectangle extends Figures {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public void are() {
        System.out.println("Площадь прямоугольника: " + (this.getA() * this.getB()));
    }
}

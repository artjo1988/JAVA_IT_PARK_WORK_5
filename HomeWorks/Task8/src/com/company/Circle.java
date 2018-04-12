package com.company;

/**
 * Created by Макс on 12.04.2018.
 */
public class Circle extends Figures {

    public Circle(double a) {
        super(a);
    }

    @Override
    public void are() {
        System.out.println("Площадь окружности: " + (2 * 3.14 * this.getA() * this.getA()));
    }
}

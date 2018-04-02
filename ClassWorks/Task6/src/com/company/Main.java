package com.company;

public class Main {

    public static void main(String[] args) {
	RationalNumber number = new RationalNumber(7,2);
        System.out.println(number.show());
        System.out.println(number.toDouble());
    RationalNumber number1 = new RationalNumber();
        System.out.println(number1.show());
        System.out.println(number1.toDouble());
    }
}

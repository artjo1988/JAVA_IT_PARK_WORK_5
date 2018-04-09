package com.company;

public class Main {

    public static void main(String[] args) {

        RationalNumbers number = new RationalNumbers();
        number.show();
        System.out.println(number.toDouble());

        RationalNumbers number1 = new RationalNumbers(7,2);
        number1.show();
        System.out.println(number1.toDouble());

        RationalNumbers number2 = new RationalNumbers(10,2);
        System.out.println("НОД: " + number2.nod(10, 2 ));
        number2.optimaze();
    }
}

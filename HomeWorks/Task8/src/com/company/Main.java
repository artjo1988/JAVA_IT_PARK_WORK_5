package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадрата:");
        Figures square = new Square(scanner.nextDouble());
        System.out.println("Введите стороны прямоугольника:");
        Figures rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Введите стороны треугольника:");
        Figures triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Введите радиус окружности:");
        Figures circle = new Circle(scanner.nextDouble());
        System.out.println("Введите радиусs эллипса:");
        Figures ecllipse = new Ellipse(scanner.nextDouble(), scanner.nextDouble());
        System.out.println();

        Figures arr [] = {square, rectangle, triangle, circle, ecllipse};
        for (Figures x : arr) x.are();
    }
}

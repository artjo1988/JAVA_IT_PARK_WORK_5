package com.company;

public class Main {

    public static void main(String[] args) {
	Car sportCar = new Car("Nissan 350Z", 18.5, 300);
	sportCar.addAllFuel(50, 35);
    sportCar.go(50);
        System.out.println("Пробег спорткара: " + sportCar.getMileage());
        System.out.println("Запас топлива :" + sportCar.getFuelAmount());
        System.out.println("Запас закиси азота: " + sportCar.getNitrousOxideAmount());
        System.out.println();

    Motorbike bike = new Motorbike("Honda", 7.0, true);
    bike.addFuel(15);
    bike.go(35);
        System.out.println("Пробег мотоцикла: " + bike.getMileage());
        System.out.println("Запас топлива :" + bike.getFuelAmount());
        System.out.println();

    Aircraft aircraft = new Aircraft("СУ",100, 35);
    aircraft.addFuel(800);
    aircraft.go(550);
        System.out.println("Самолёт пролетел: " + aircraft.getMileage());
        System.out.println("Запас топлива :" + aircraft.getFuelAmount());
        System.out.println("Пассажиров перевёз: " + aircraft.getNumberOfPassengers());
        System.out.println();

    Tank tank = new Tank ("T", 50, 1300);
    tank.addFuel(300);
    tank.go(150);
        System.out.println("Танк проехал: " + tank.getMileage());
        System.out.println("Запас топлива :" + tank.getFuelAmount());
        System.out.println("Запас боеприпасов: " + tank.getAmmunition());
        System.out.println();
    }
}

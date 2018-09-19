package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(9, "Base");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Honda h = new Honda(6, "City");
        System.out.println(h.startEngine());
        System.out.println(h.accelerate());
        System.out.println(h.brake());
    }
}

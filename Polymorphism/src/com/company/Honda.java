package com.company;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> starting engine";
    }

    public String accelerate(){
        return "Car -> accelerating";
    }

    public String brake(){
        return "Car -> brakes";
    }
}

class Honda extends Car{
    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Honda starting engine";
    }

    @Override
    public String accelerate() {
        return "Honda accelerating";
    }

    @Override
    public String brake() {
        return "Honda braking";
    }
}


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

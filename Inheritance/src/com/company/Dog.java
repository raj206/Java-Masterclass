package com.company;

public class Dog extends Animal{
    private int eyes;
    private int legs;
    private int teeth;
    private String coat;
    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.coat = coat;
        this.teeth = teeth;
    }
    public void barking(){
        System.out.println("Dog barks!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats!");
        super.eat();
    }
    public void walk(){
        System.out.println("Dog walks.");
        move(5);
    }
}

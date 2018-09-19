package com.company;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // Constructor
    public Animal(String name, int brain, int body, int size, int weight){
        this.name = name;
        this.body = body;
        this.brain = brain;
        this.weight = weight;
        this.size = size;
    }

    // Getters
    public String getName(){
        return name;
    }
    public int getBrain(){
        return brain;
    }
    public int getBody(){
        return  body;
    }
    public int getSize(){
        return  size;
    }
    public int getWeight(){
        return weight;
    }

    // Manipulation methods
    public void eat(){
        System.out.println("Animal eats.");
    }
    public void move(int speed){
        System.out.println("Animal moves at " + speed + "mph");
    }
}

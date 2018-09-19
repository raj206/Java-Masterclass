package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1,1,5, 6);
        Dog dog = new Dog("Chops", 1, 1, 2,4,40, "a");
        dog.barking();
        dog.eat();
        dog.walk();
    }
}

package com.company;

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



package com.company;

public class Car {
    private int doors;
    private String model;
    private int wheels;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("ultima") || validModel.equals("slc")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel(){
        return this.model;
    }
}

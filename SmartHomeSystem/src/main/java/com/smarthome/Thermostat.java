package com.smarthome;

/**
 * Concrete implementation of smart thermostat
 * */

public class Thermostat implements Device{
    private final String id;
    private final String name;
    private boolean on;
    private double temperature;

    public Thermostat(String id, String name){
        this.id = id;
        this.name = name;
        this.on = false;
        this.temperature = 22.0;
    }
    @Override
    public String getId(){
        return id;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public boolean isOn(){
        return on;
    }
    @Override
    public void turnOn(){
        this.on = true;
    }
    @Override
    public void turnOff(){
        this.on = false;
    }
    public void setTemperature(double temperature){
        this.temperature = temperature;
    }
    public double getTemperature(){
        return temperature;
    }
    @Override
    public String getStatus(){
        return "Thermostat " + name + " is " + (on ? "ON" : "OFF") +
                "(Temperature: " + temperature + "C)";
    }

}
package com.smarthome;

/**
 * Concrete implementation of a smart light
 */
public class Light implements Device {
    private final String id;
    private final String name;
    private boolean on;
    private int brightness;

    public Light(String id, String name) {
        this.id = id;
        this.name = name;
        this.on = false;
        this.brightness = 50;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;
    }

    public void setBrightness(int brightness) {
        if (brightness < 0) {
            this.brightness = 0;
        } else if (brightness > 100) {
            this.brightness = 100;
        } else {
            this.brightness = brightness;
        }
    }

    public int getBrightness() {
        return brightness;
    }

    @Override
    public String getStatus() {
        return "Light " + name + " is " + (on ? "ON" : "OFF") +
                " (Brightness: " + brightness + "%)";
    }
}
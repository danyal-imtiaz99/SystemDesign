package com.smarthome;

/**
 * Interface representing any smart device in the home
 */
public interface Device {
    String getId();
    String getName();
    boolean isOn();
    void turnOn();
    void turnOff();
    String getStatus();
}

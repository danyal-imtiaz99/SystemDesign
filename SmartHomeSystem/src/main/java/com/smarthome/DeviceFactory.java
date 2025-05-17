package com.smarthome;

import java.util.UUID;

/**
 * Factory for creating different types of devices
 * */

public class DeviceFactory{
    public enum DeviceType{
        LIGHT,
        THERMOSTAT
    }
    public static Device createDevice(DeviceType type, String name) {
        String id = UUID.randomUUID().toString();
        return switch(type){
            case LIGHT -> new Light(id, name);
            case THERMOSTAT -> new Thermostat(id, name);
        };
    }
}
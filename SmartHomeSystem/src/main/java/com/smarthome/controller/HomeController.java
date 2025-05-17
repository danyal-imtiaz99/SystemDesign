package com.smarthome.controller;

import com.smarthome.Device;
import com.smarthome.DeviceService;
import com.smarthome.Light;
import com.smarthome.Thermostat;

import java.util.List;
import java.util.Optional;

/**
 * Controller for handling home automation operations
 */
public class HomeController {
    private final DeviceService deviceService;

    public HomeController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    public void addDevice(Device device) {
        deviceService.addDevice(device);
    }

    public void removeDevice(String id) {
        deviceService.removeDevice(id);
    }

    public void turnOnDevice(String id) {
        deviceService.turnOnDevice(id);
    }

    public void turnOffDevice(String id) {
        deviceService.turnOffDevice(id);
    }

    public void turnOnAllDevices() {
        deviceService.turnOnAllDevices();
    }

    public void turnOffAllDevices() {
        deviceService.turnOffAllDevices();
    }

    public void showAllDevices() {
        List<Device> devices = deviceService.getAllDevices();
        System.out.println("===== All Devices =====");
        if (devices.isEmpty()) {
            System.out.println("No devices found.");
        } else {
            for (Device device : devices) {
                System.out.println(device.getStatus());
            }
        }
        System.out.println("=======================");
    }

    public void adjustLight(String id, int brightness) {
        Optional<Device> deviceOpt = deviceService.getDeviceById(id);
        deviceOpt.ifPresent(device -> {
            if (device instanceof Light) {
                ((Light) device).setBrightness(brightness);
                System.out.println("Adjusted light brightness: " + ((Light) device).getStatus());
            } else {
                System.out.println("Device is not a light: " + id);
            }
        });
    }

    public void adjustThermostat(String id, double temperature) {
        Optional<Device> deviceOpt = deviceService.getDeviceById(id);
        deviceOpt.ifPresent(device -> {
            if (device instanceof Thermostat) {
                ((Thermostat) device).setTemperature(temperature);
                System.out.println("Adjusted thermostat temperature: " + ((Thermostat) device).getStatus());
            } else {
                System.out.println("Device is not a thermostat: " + id);
            }
        });
    }
}
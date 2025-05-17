package com.smarthome;

import com.smarthome.config.HomeConfig;
import com.smarthome.controller.HomeController;

public class Main {
    public static void main(String[] args) {
        // Create system using configuration
        HomeController homeController = HomeConfig.createHomeSystem();

        // Create and add some devices
        Device livingRoomLight = DeviceFactory.createDevice(DeviceFactory.DeviceType.LIGHT, "living_room_light");
        Device kitchenLight = DeviceFactory.createDevice(DeviceFactory.DeviceType.LIGHT, "kitchen_light");
        Device thermostat = DeviceFactory.createDevice(DeviceFactory.DeviceType.THERMOSTAT, "main_thermostat");

        homeController.addDevice(livingRoomLight);
        homeController.addDevice(kitchenLight);
        homeController.addDevice(thermostat);

        // Display all devices
        homeController.showAllDevices();

        // Turn on specific devices
        homeController.turnOnDevice(livingRoomLight.getId());
        homeController.adjustLight(livingRoomLight.getId(), 75);

        homeController.turnOnDevice(thermostat.getId());
        homeController.adjustThermostat(thermostat.getId(), 24.5);

        // Show updated devices
        homeController.showAllDevices();

        // Turn off all devices
        homeController.turnOffAllDevices();
        homeController.showAllDevices();
    }
} 
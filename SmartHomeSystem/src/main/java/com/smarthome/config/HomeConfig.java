package com.smarthome.config;

import com.smarthome.DeviceService;
import com.smarthome.DeviceServiceImpl;
import com.smarthome.InMemoryDeviceRepository;
import com.smarthome.controller.HomeController;
import com.smarthome.repository.DeviceRepository;

/**
 * Configuration for setting up the home system
 */
public class HomeConfig {

    public static HomeController createHomeSystem() {
        // Create repository
        DeviceRepository deviceRepository = new InMemoryDeviceRepository();

        // Create service with repository
        DeviceService deviceService = new DeviceServiceImpl(deviceRepository);

        // Create controller with service
        return new HomeController(deviceService);
    }
}
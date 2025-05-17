package com.smarthome;

import java.util.List;
import java.util.Optional;

/**
 * Service interface for device operations
 * */

public interface DeviceService{
    List<Device> getAllDevices();
    Optional<Device> getDeviceById(String id);
    void addDevice(Device device);
    void removeDevice(String id);
    void turnOnDevice(String id);
    void turnOffDevice(String id);
    void turnOnAllDevices();
    void turnOffAllDevices();
}
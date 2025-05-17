package com.smarthome;

import com.smarthome.repository.DeviceRepository;
import java.util.List;
import java.util.Optional;

/**
 * Implementation of DeviceService
 */
public class DeviceServiceImpl implements DeviceService {
    private final DeviceRepository deviceRepository;

    // Dependency injection through constructor
    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    @Override
    public Optional<Device> getDeviceById(String id) {
        return deviceRepository.findById(id);
    }

    @Override
    public void addDevice(Device device) {
        deviceRepository.save(device);
    }

    @Override
    public void removeDevice(String id) {
        deviceRepository.delete(id);
    }

    @Override
    public void turnOnDevice(String id) {
        deviceRepository.findById(id).ifPresent(Device::turnOn);
    }

    @Override
    public void turnOffDevice(String id) {
        deviceRepository.findById(id).ifPresent(Device::turnOff);
    }

    @Override
    public void turnOnAllDevices() {
        List<Device> devices = deviceRepository.findAll();
        for (Device device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOffAllDevices() {
        List<Device> devices = deviceRepository.findAll();
        for (Device device : devices) {
            device.turnOff();
        }
    }
}
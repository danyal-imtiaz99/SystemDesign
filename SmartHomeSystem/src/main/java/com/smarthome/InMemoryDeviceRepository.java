package com.smarthome;

import com.smarthome.repository.DeviceRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * In-Memory implementation of DeviceRepository
 */
public class InMemoryDeviceRepository implements DeviceRepository {
    private final Map<String, Device> devices = new HashMap<>();

    @Override
    public List<Device> findAll() {
        return new ArrayList<>(devices.values());
    }

    @Override
    public Optional<Device> findById(String id) {
        return Optional.ofNullable(devices.get(id));
    }

    @Override
    public void save(Device device) {
        devices.put(device.getId(), device);
    }

    @Override
    public void delete(String id) {
        devices.remove(id);
    }
}
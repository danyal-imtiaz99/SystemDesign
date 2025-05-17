package com.smarthome.repository;

import com.smarthome.Device;
import java.util.List;
import java.util.Optional;

/**
 * Repository interface for device persistence
 */
public interface DeviceRepository {
    List<Device> findAll();
    Optional<Device> findById(String id);
    void save(Device device);
    void delete(String id);
}
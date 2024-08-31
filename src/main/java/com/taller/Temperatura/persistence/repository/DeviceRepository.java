package com.taller.Temperatura.persistence.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.taller.Temperatura.persistence.crud.DeviceCrud;
import com.taller.Temperatura.persistence.entity.Device;

import java.util.*;

@Repository
public class DeviceRepository {
    private final DeviceCrud deviceCrud;

    @Autowired
    public DeviceRepository(DeviceCrud deviceCrud) {
        this.deviceCrud = deviceCrud;
    }

    public Optional<Device> searchByName(String name) {
        return deviceCrud.findByName(name);
    }

    public List<Device> searchByLocation(String location) {
        return deviceCrud.findByLocation(location);
    }

    public void deleteByName(String name) {
        deviceCrud.findByName(name).ifPresent(deviceCrud::delete);
    }
}

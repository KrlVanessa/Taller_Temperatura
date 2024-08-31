package com.taller.Temperatura.persistence.repository;

import com.taller.Temperatura.persistence.crud.TemperatureRangeCrud;
import com.taller.Temperatura.persistence.entity.TemperatureRange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class TemperatureRangeRepository {

    private final TemperatureRangeCrud temperatureRangeCrud;

    @Autowired
    public TemperatureRangeRepository(TemperatureRangeCrud temperatureRangeCrud) {
        this.temperatureRangeCrud = temperatureRangeCrud;
    }

    public Optional<List<TemperatureRange>> getRangesByDevice(Long deviceId) {
        return temperatureRangeCrud.findByDeviceId(deviceId);
    }

    public Optional<TemperatureRange> getRangeContainingTemperature(double temperature) {
        return temperatureRangeCrud.findByMinTemperatureLessThanEqualAndMaxTemperatureGreaterThanEqual(temperature);
    }

    public TemperatureRange save(TemperatureRange temperatureRange) {
        return temperatureRangeCrud.save(temperatureRange);
    }

    public void deleteById(Long id) {
        temperatureRangeCrud.deleteById(id);
    }
}

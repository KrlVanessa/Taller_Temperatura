package com.taller.Temperatura.persistence.repository;

import com.taller.Temperatura.persistence.crud.TemperatureReadingCrud;
import com.taller.Temperatura.persistence.entity.TemperatureReading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;


@Repository
public class TemperatureReadingRepository {

    private final TemperatureReadingCrud temperatureReadingCrud;

    @Autowired
    public TemperatureReadingRepository(TemperatureReadingCrud temperatureReadingCrud) {
        this.temperatureReadingCrud = temperatureReadingCrud;
    }

    public Optional<List<TemperatureReading>> getReadingsByDevice(Long deviceId) {
        return temperatureReadingCrud.findByDeviceId(deviceId);
    }

    public Optional<List<TemperatureReading>> getReadingsByTimeRange(LocalDateTime startTime, LocalDateTime endTime) {
        return temperatureReadingCrud.findByReadingTimeBetween(startTime, endTime);
    }

    public TemperatureReading save(TemperatureReading temperatureReading) {
        return temperatureReadingCrud.save(temperatureReading);
    }

    public void deleteById(Long id) {
        temperatureReadingCrud.deleteById(id);
    }
}

package com.taller.Temperatura.persistence.crud;

import com.taller.Temperatura.persistence.entity.TemperatureReading;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TemperatureReadingCrud extends CrudRepository<TemperatureReading, Long> {

    Optional<List<TemperatureReading>> findByDeviceId(Long deviceId);

    Optional<List<TemperatureReading>> findByReadingTimeBetween(LocalDateTime startTime, LocalDateTime endTime);
}

package com.taller.Temperatura.persistence.crud;

import com.taller.Temperatura.persistence.entity.TemperatureRange;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface TemperatureRangeCrud extends CrudRepository<TemperatureRange, Long> {
    Optional<List<TemperatureRange>> findByDeviceId(Long deviceId);

    Optional<TemperatureRange> findByMinTemperatureLessThanEqualAndMaxTemperatureGreaterThanEqual(double temperature);
}

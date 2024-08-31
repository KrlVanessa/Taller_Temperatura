package com.taller.Temperatura.persistence.crud;

import com.taller.Temperatura.persistence.entity.DeviceStatus;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface DeviceStatusCrud extends CrudRepository<DeviceStatus, Long> {

    List<DeviceStatus> findByStatus(String status);

    Optional<List<DeviceStatus>> findByDeviceId(Long deviceId);

    List<DeviceStatus> findByLastCheckedBetween(LocalDateTime start, LocalDateTime end);
}

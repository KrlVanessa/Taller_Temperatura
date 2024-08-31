package com.taller.Temperatura.persistence.crud;

import com.taller.Temperatura.persistence.entity.MaintenanceLog;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MaintenanceLogCrud extends CrudRepository<MaintenanceLog, Long> {

    List<MaintenanceLog> findByMaintenanceDate(LocalDateTime maintenanceDate);

    Optional<List<MaintenanceLog>> findByDeviceId(Long deviceId);

    Optional<List<MaintenanceLog>> findByPerformedById(Long userId);
}

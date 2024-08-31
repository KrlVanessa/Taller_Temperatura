package com.taller.Temperatura.persistence.crud;

import com.taller.Temperatura.persistence.entity.Alert;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface AlertCrud extends CrudRepository<Alert, Long> {

    List<Alert> findByIsActiveTrue();

    List<Alert> findBySeverityLevel(String severityLevel);

    List<Alert> findByAlertTimeBetween(LocalDateTime start, LocalDateTime end);

    Optional<List<Alert>> findByDeviceId(Long deviceId);
}

package com.taller.Temperatura.persistence.crud;

import com.taller.Temperatura.persistence.entity.Device;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DeviceCrud extends CrudRepository<Device, Long> {

    // Método para bscar dispositivos por nombre
    Optional<Device> findByName(String name);

    // Método para bscar dispositivos por ubicación
    List<Device> findByLocation(String location);

    // Método para eliminar dispositivos por nombre
    void deleteByName(String name);
}

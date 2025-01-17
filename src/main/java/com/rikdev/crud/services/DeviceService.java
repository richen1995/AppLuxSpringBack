package com.rikdev.crud.services;


import com.rikdev.crud.entities.Device;

import java.util.List;
import java.util.Optional;

public interface DeviceService {
    Device saveDevice(Device device);
    Device updateDevice(Device device);
    List<Device> getDevices();                  //obtener todos los libros
    Optional<Device> getDeviceById(Long id);
    void deleteDevice(Long id);
}

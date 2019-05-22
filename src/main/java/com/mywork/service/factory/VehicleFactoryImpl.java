package com.mywork.service.factory;

import com.mywork.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class VehicleFactoryImpl implements VehicleFactory {

    private final Map<String, VehicleService> VEHICLE_SERVICES_MAP = new HashMap<>();

    @Autowired
    public VehicleFactoryImpl(List<VehicleService> vehicleServices) {
        vehicleServices.forEach(vehicleService ->
        {
            VEHICLE_SERVICES_MAP.put(vehicleService.getName(), vehicleService);
        });
    }

    public VehicleService getVehicleService(String name) {
        return VEHICLE_SERVICES_MAP.get(name);
    }

    public List<VehicleService> getVehicleServices() {
        return (List) VEHICLE_SERVICES_MAP.values();
    }
}

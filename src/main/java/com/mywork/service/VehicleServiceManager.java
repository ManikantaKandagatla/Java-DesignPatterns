package com.mywork.service;

import com.mywork.service.factory.VehicleFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceManager {

    @Autowired
    private VehicleFactory vehicleFactory;


    public VehicleService getVehicleService(String vehicleName) {
        VehicleService vehicleService = vehicleFactory.getVehicleService(vehicleName);
        return vehicleService;
    }


    public String ride(String vehicleName) {
        VehicleService vehicleSerive = getVehicleService(vehicleName);
        return vehicleSerive.ride();
    }
}

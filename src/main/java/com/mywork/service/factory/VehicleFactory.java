package com.mywork.service.factory;

import com.mywork.service.VehicleService;

import java.util.List;

public interface VehicleFactory {
    VehicleService getVehicleService(String name);
    List<VehicleService> getVehicleServices();
}

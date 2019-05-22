package com.mywork.controller;


import com.mywork.service.VehicleServiceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class VehicleController {

    @Autowired
    private VehicleServiceManager vehicleServiceManager;

    @RequestMapping(method = RequestMethod.GET, value = "/rideVehicle")
    public Map<String, Object> getMessage(@RequestParam String vehicle)  {
        Map<String, Object> data = new HashMap<>();
        data.put("data", vehicleServiceManager.ride(vehicle));
        return data;
    }

}

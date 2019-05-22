package com.mywork.service;

import org.springframework.stereotype.Service;

@Service
public class BikeService implements VehicleService {
    public String getType() {
        return "Two wheeler";
    }

    public int getMilage() {
        return 6;
    }

    public String getName() {
        return "BIKE";
    }

    public String ride() {
        return "I'm riding happily on a Bike";
    }

}

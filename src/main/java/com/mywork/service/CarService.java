package com.mywork.service;


import org.springframework.stereotype.Service;


@Service
public class CarService implements VehicleService {
    public String getType() {
        return "Two wheeler";
    }

    public int getMilage() {
        return 15;
    }

    public String getName() {
        return "CAR";
    }

    public String ride() {
        return "I'm riding happily on a Car ";
    }
}

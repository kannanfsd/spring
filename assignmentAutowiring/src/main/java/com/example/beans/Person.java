package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "personBean")
public class Person {
    private final String name = "Ramesh";
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person object is created by spring.");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}



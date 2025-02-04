package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private Vehicle vehicle;
    @Autowired
    public Person(Vehicle vehicle) {
        System.out.println("Person bean created by spring.");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

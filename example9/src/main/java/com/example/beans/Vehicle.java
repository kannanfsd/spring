package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class Vehicle {

    private String name;

    public Vehicle() {
        System.out.println("Vehicle object is created.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void printHello(){
        System.out.println("This is printHello Method Response.");
    }

    @Override
    public String toString() {
        return "Vehicle name is "+name;
    }
}

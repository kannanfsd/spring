package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ProjectConfig {
    @Bean(name = "audiVehicle")
    public Vehicle vehicle1() {
        var vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }

    @Bean(value = "hondaVehicle")
    public Vehicle vehicle2() {
        var vehicle = new Vehicle();
        vehicle.setName("Honda");
        return vehicle;
    }
    @Primary
    @Bean("ferrariVehicle")
    public Vehicle vehicle3() {
        var vehicle = new Vehicle();
        vehicle.setName("Ferrari");
        return vehicle;
    }

}

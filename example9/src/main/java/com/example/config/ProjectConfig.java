package com.example.config;

import com.example.beans.Person;
import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class ProjectConfig {
    @Bean
    public Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("TATA");
        return vehicle;
    }

    @Bean
    public Person person() {
        var person = new Person();
        person.setName("Lisa");
        person.setVehicle(vehicle());
        return person;
    }

}

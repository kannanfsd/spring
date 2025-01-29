package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ProjectConfig {
    @Bean
    public Vehicle vehicle() {
        var vehicle = new Vehicle();
        vehicle.setName("Audi 8");
        return vehicle;
    }
    @Bean
    public String hello() {
        return "Hello World";
    }
    @Bean
    public Number number() {
        return 25;
    }
}

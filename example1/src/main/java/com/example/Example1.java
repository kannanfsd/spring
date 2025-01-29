package com.example;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Direct Instance: "+vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean(Vehicle.class);
        System.out.println("Bean Instance: "+vehicle1.getName());

        String helloString = context.getBean(String.class);
        System.out.println("Welcome message: "+helloString);

        Number myNumber = context.getBean(Number.class);
        System.out.println("Number instance: "+myNumber);
    }
}

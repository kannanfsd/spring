package com.example;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle1 = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Bean Instance: "+vehicle1.getName());

        Vehicle vehicle2 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Bean Instance: "+vehicle2.getName());

        Vehicle vehicle3 = context.getBean("ferrariVehicle", Vehicle.class);
        System.out.println("Bean Instance: "+vehicle3.getName());
    }
}

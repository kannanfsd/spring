package com.example;
import com.example.config.ProjectConfig;
import com.example.services.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrototypeDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleService service1 = context.getBean(VehicleService.class);
        VehicleService service2 = context.getBean("vehicleService", VehicleService.class);
        System.out.println("Hashcode of VehicleService-1 object: " + service1.hashCode());
        System.out.println("Hashcode of VehicleService-2 object: " + service2.hashCode());
        if(service1 == service2) {
            System.out.println("Vehicle service bean is singleton");
        } else {
            System.out.println("Vehicle service bean is prototype");
        }
    }
}

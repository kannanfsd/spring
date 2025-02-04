package com.example;
import com.example.beans.Person;
import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example15 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        for(String pList: persons){
            System.out.println(pList);
        }
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println("\nDivider panel\n");
        Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleService().playMusic();
        vehicle.getVehicleService().moveVehicle();
        System.out.println("\nDivider panel\n");
        person.getVehicle().getVehicleService().playMusic();
        person.getVehicle().getVehicleService().moveVehicle();

    }
}

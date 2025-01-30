package com.example;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example8 {
    /**
     * Example of how to use Spring's IoC container to get a bean.
     * The {@code beans.xml} file is used to configure the container.
     * The {@code hondaVehicle} bean is retrieved from the container.
     * The name of the vehicle is then printed out.
     * @param args command line arguments
     */
    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle1 = context.getBean("hondaVehicle", Vehicle.class);
        System.out.println("Bean Instance: "+vehicle1.getName());

    }
}

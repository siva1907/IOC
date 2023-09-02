package com.ioc.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
    public static void main(String[] args) {
        // Load the Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Get the Garage bean from the context
        Garege garage = (Garege) context.getBean("garageBean");

        // Call the park method
        garage.park();
    }
}

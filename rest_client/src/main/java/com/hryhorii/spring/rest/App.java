package com.hryhorii.spring.rest;

import com.hryhorii.spring.rest.configuration.MyConfig;
import com.hryhorii.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
    }
}

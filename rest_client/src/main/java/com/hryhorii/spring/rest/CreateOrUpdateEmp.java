package com.hryhorii.spring.rest;

import com.hryhorii.spring.rest.configuration.MyConfig;
import com.hryhorii.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CreateOrUpdateEmp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);

        Employee emp = new Employee("Svitlana", "Sokolova", "HR", 1200);//create

        emp.setId(8);//Or update
        communication.saveEmployee(emp);

    }
}

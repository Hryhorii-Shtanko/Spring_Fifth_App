package com.hryhorii.spring.rest;

import com.hryhorii.spring.rest.configuration.MyConfig;
import com.hryhorii.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class GetEmp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);

        Employee empByID = communication.getEmployee(1);
        System.out.println(empByID);


    }
}

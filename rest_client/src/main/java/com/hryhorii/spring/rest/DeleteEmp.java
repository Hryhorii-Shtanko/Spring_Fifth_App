package com.hryhorii.spring.rest;

import com.hryhorii.spring.rest.configuration.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DeleteEmp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",
                Communication.class);

        communication.deleteEmployee(8);

    }
}

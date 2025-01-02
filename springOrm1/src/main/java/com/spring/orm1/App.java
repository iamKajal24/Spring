package com.spring.orm1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm1.dao.StudentDao;
import com.spring.orm1.entities.Students;

public class App {
    public static void main(String[] args) {
        System.out.println("Program started...");

        // Load Spring configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");

        // Get the StudentDao bean from the context
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

        // Create a new student object
        Students student = new Students(2324, "Kajal Pandit", "Haridwar");

        // Insert the student into the database
        int result = studentDao.insert(student);

        System.out.println("Student inserted with ID: " + result);
    }
}

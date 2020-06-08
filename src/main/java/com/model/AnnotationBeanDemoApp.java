package com.model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanDemoApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach coach2 = context.getBean("tennisCoach", Coach.class);

        boolean result = coach == coach2;


        System.out.println("Result is " + result);
        System.out.println("Memory for coach is " + coach);
        System.out.println("Memory for coach2 is " + coach2);

        context.close();

    }

}

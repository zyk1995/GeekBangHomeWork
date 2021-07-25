package com.zyk.homework.week5;

import com.zyk.spring01.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Homework2BeanMain {

    public static void main(String[] args) {
        ApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.zyk.homework.week5");
        Student beanStu01 = (Student) annotationConfigApplicationContext.getBean("beanStu01");
        System.out.println(beanStu01.toString());


        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student beanStu02 = (Student) classPathXmlApplicationContext.getBean("beanStu02");
        System.out.println(beanStu02.toString());
    }

}

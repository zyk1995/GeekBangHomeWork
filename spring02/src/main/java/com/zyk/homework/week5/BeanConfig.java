package com.zyk.homework.week5;


import com.zyk.spring01.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public Student beanStu01() {
        return  new Student(1, "beanStu01");
    }

}

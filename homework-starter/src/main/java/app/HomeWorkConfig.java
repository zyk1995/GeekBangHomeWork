package app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HomeWorkConfig {
    @Bean
    public Student student100() {
        return  new Student(1, "student100");
    }

    @Bean
    public Klass klass() {
        return  new Klass();
    }

    @Bean
    public School school() {
        return  new School();
    }
}

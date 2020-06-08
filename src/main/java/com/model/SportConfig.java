package com.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.model")
public class SportConfig {


    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }


    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
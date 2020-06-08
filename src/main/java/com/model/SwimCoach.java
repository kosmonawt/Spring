package com.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;


@Getter
@Setter
public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String email;


    @Value("${foo.team}")
    private String team;

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim coach daily workout ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}

package com.model;


import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class SwimCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Swim coach daily workout ";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

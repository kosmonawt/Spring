package com.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Component
@Getter
@Setter
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;


    @Override
    public String getDailyWorkout() {
        return "Play tennis every day";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

package com.model;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] data = {
            "First random string from randomFortuneService",
            "Second random string from randomFortuneService",
            "Third random string from randomFortuneService",
            "Fourth random string from randomFortuneService",
            "Fifth random string from randomFortuneService"
    };

    private Random random = new Random();

    @Override
    public String getFortune() {

        int index = random.nextInt(data.length);
        String fortune = data[index];

        return fortune;
    }

}

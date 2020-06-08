package com.model;


public class SadFortuneService implements FortuneService {



    @Override
    public String getFortune() {
        return "Bad day to do this";
    }
}

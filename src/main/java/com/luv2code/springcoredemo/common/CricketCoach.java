package com.luv2code.springcoredemo.common;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("in constructor : "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "practise fast bowling for 20 minutes mohd suhaib khan....";
    }


    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("in doMyStartupStuff : "+ getClass().getSimpleName());
    }


    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("in doMyCleanupStuff : "+ getClass().getSimpleName());
    }

}

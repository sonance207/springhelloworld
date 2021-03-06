package com.johnmcgrath.springhelloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by john on 4/28/17.
 */

public class NewRobot {

    private String id = "Default robot";
    private String speech = "hello";

    public void speak() {
        System.out.println(id + ": " + speech);
    }



    @Autowired
    public void setId(@Value("${jdbc.user}") String id) {
        this.id = id;
    }

    @Autowired
    public void setSpeech(@Value("${jdbc.password}") String speech) {
        this.speech = speech;
    }

}
package com.springconfig.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{
    @Autowired
    private Draw2D draw2D;
    @Override
    public void getName() {
    }
    public void draw(){
        draw2D.draw("Triangle");
    }
}
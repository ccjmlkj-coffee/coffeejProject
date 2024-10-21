package com.coffee.designPattern.strategy.classes;

import com.coffee.designPattern.strategy.interfaces.IBehave;

public class BehaveEat implements IBehave {
    @Override
    public String myBehave() {
        return "i want to eat!";
    }
}

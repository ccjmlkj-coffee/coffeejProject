package com.coffee.designPattern.observer.classs;

import com.coffee.designPattern.observer.interfaces.Observer;

public class ObserverOne implements Observer {
    @Override
    public boolean doAction(String msg) {
        System.out.println("subject notice to do action, msg:"+msg);
        return true;
    }
}

package com.coffee.designPattern.observer.classs;

import com.coffee.designPattern.observer.interfaces.Observer;
import com.coffee.designPattern.observer.interfaces.Subject;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SubjectManager implements Subject {
    List<Observer> observers = new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public boolean noticeObserver(String msg) {
        for (Observer observer : observers) {
            observer.doAction(msg);
        }
        return true;
    }

}

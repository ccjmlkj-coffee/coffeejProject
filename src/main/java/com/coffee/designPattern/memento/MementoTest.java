package com.coffee.designPattern.memento;

public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("state ## 1");
        originator.setState("state ## 2");
        CareTaker careTaker = new CareTaker();
        careTaker.putMemento(originator.setMemento());
        originator.setState("state ## 3");
        careTaker.putMemento(originator.setMemento());
        System.out.println("current state : "+originator.getState());
        for (Memento memento : careTaker.mementoList) {
            System.out.println("op state =>");
            System.out.println(memento.getState());
        }

    }
}

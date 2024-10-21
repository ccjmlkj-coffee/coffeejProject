package com.coffee.designPattern.memento;

import lombok.Data;

@Data
public class Originator {
    private String state;

    public Memento setMemento(){
        return new Memento(this.state);
    }

    public String getMementoState(Memento memento){
        return memento.getState();
    }
}

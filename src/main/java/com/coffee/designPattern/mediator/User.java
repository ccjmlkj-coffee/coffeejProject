package com.coffee.designPattern.mediator;

import lombok.Data;

@Data
public class User {
    private String name;

    public void sendMessage(String msg){
        CharRoom.sendMessage(this,msg);
    }

}

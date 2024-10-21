package com.coffee.designPattern.mediator;

public class CharRoom {
    public static void sendMessage(User user,String msg){
        System.out.println("hello , my name is " + user.getName() +",message: "+msg);
    }
}

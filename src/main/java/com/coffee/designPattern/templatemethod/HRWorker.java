package com.coffee.designPattern.templatemethod;

public class HRWorker extends  Worker{
    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("my name is :"+name+" ,i am a hr,to make view");
    }
}

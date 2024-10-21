package com.coffee.designPattern.templatemethod;

public class ITWorker  extends  Worker{
    public ITWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("my name is :"+name+", i am a it ,make a code");
    }

    public boolean hook(){
        return true;
    }
}

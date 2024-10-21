package com.coffee.designPattern.command;

public class DefaultCommand implements Command{
    @Override
    public void execute() {
        System.out.println("没有命令");
    }
}

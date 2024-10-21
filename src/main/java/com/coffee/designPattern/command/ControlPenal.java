package com.coffee.designPattern.command;

import java.util.HashMap;
import java.util.Map;

public class ControlPenal {
    Map<String,Command> controlMap  = new HashMap<>();

    public void setCommand(String key,Command command){
        controlMap.put(key,command);
    }

    public void execute(String key){
        Command command = controlMap.getOrDefault(key,new DefaultCommand());
        command.execute();
    }
}

package com.coffee.designPattern.command;

/**
 * 命令模式
 * 实现原理：控制反转，所有调用命令都集成在一个控制器去进行
 * 也可以将命令通过请求、队列等参数，封装到Command集合里，依次执行，类似线程池（将请求封装成对象，将动作请求者和动作执行者解耦）
 */
public interface Command {
    public void execute();
}

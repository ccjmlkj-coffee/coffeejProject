package com.coffee.designPattern.observer.interfaces;

/**
 * 被观察者
 */
public interface Observer {

    /**
     * 被观察者实现类，当主题subject发出命令时，观察者实现的方法
     * @param msg 主题变更参数
     * @return 执行结构
     */
    public boolean doAction(String msg);
}

package com.coffee.designPattern.observer.interfaces;


/**
 * 观察者主题
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer 观察者实体
     */
    public void registerObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer 观察者实体
     */
    public void removeObserver(Observer observer);

    /**
     * 主题信息变更，通知被观察者执行对应方法
     * @param msg 主题变更参数
     * @return 通知结果
     */
    public boolean noticeObserver(String msg);
}

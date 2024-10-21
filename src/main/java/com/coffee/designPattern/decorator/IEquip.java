package com.coffee.designPattern.decorator;

/**
 * 装饰者模式，所有装饰者实现对象的超类
 * 在不改变原来对象基础信息的情况下，给对象附加一些其他的功能
 * 原则：对修改关闭，对拓展开放
 */
public interface IEquip {

    public int calculateAttack();

    public void printDesc();
}

package com.coffee.designPattern.templatemethod;

import java.util.Date;

/**
 * 模板方法设计模式三要素：
 * 1.具体方法
 * 2.抽象方法
 * 3.钩子方法
 * 适合流程化场景代码开发
 */
public abstract class Worker {
    String name;

    public Worker(String name){
        this.name = name;
    }

    /**
     * 抽象方法
     * 不同的继承者，实现自己的算法步骤
     */
    public abstract void work();


    /**
     具体方法：规范化算法流程，所有的继承子类都按固定的方案走
     */
    public void workOneDay(){
        entryCompany();
        work();
        quitCompany();
    }

    /**
     * 钩子方法，对特定的运算节点做补充
     * @return 是否执行钩子
     */
    public boolean hook(){
        return false;
    }

    public void entryCompany(){
        System.out.println("进入公司--");
    }

    public void quitCompany(){
        if(hook()){
            System.out.println("打印下班时间："+ new Date().toString());
        }
        System.out.println("离开公司--");
    }
}

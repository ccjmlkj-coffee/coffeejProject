package com.coffee.base.finalTest;

import com.coffee.base.bean.CommonBean;

public class ModifyFinalTest {

    public static void main(String[] args) {
        final CommonBean commonBean = new CommonBean("dsa",55);
        commonBean.setName("ccj");
        commonBean.setAge(889);
        paramUse(commonBean);
    }

    /**
     * final修饰对象的成员变量可以修改，本身指定的对象修改不了
     * final的异常，在编码层面会报错，基本可以书写的代码都是正确的
     * @param commonBean
     */
      static void paramUse(final CommonBean commonBean){
        System.out.println(commonBean);
        commonBean.setAge(77);
        commonBean.setName("coffee");
        System.out.println(commonBean);
    }
}

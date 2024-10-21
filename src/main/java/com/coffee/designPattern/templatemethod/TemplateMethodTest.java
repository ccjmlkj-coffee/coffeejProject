package com.coffee.designPattern.templatemethod;

public class TemplateMethodTest {
    public static void main(String[] args) {
        Worker itWorker = new ITWorker("makaijian");
        Worker hrWorker = new HRWorker("fangjiahui");
        itWorker.workOneDay();
        hrWorker.workOneDay();
    }
}

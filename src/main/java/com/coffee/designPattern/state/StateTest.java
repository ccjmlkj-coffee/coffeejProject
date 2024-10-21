package com.coffee.designPattern.state;

public class StateTest {
    public static void main(String[] args) {
        //实际运用场景，需要考虑并发环境 state AtomicInteger + (synchronized or lock)
        VendingMachine vendingMachine = new VendingMachine(5);
        vendingMachine.insertMoney();
        vendingMachine.sellProduct();
        vendingMachine.sellProduct();
        vendingMachine.quitMoney();
        vendingMachine.insertMoney();
        vendingMachine.quitMoney();
    }
}

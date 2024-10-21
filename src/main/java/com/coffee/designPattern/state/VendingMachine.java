package com.coffee.designPattern.state;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 状态模式，根据不同状态执行对不同动作的执行方法不同
 */
public class VendingMachine {
    public static final int NO_MONEY = 0;//未投币
    public static final int HAS_MONEY = 1;//已经投币
    public static final int SELLING = 2;//正在出货
    public static final int SELLOUT=3;//售罄

    private int count = 0;//售货机商品数量

    private int CURRENT_STATE = NO_MONEY;

    public VendingMachine(int count){
        this.count = count;
    }

    public void insertMoney(){
        switch (CURRENT_STATE){
            case NO_MONEY:
                System.out.println("你已经投币");
                CURRENT_STATE = HAS_MONEY;//无币状态，可以正常投币
                break;
            case HAS_MONEY:
                System.out.println("你已经投币，无需重复投币");
                break;
            case SELLING:
                System.out.println("售货机正在出货，请稍后投币");
                break;
            case SELLOUT:
                System.out.println("售货机已经售罄，请勿投币");
                break;
        }
    }

    public void quitMoney(){
        switch (CURRENT_STATE){
            case NO_MONEY:
                System.out.println("你还没投币，不能退币");
                break;
            case HAS_MONEY:
                payMoney();
                CURRENT_STATE = NO_MONEY;
                break;
            case SELLING:
                System.out.println("售货机正在出货，无法退币");
                break;
            case SELLOUT:
                System.out.println("售货机已经售罄，没有币");
                break;
        }
    }

    public void sellProduct(){
        switch (CURRENT_STATE){
            case NO_MONEY:
                System.out.println("你还没投币，不能购买商品");
                break;
            case HAS_MONEY:
                CURRENT_STATE = SELLING;
                sell();
                CURRENT_STATE = NO_MONEY;
                break;
            case SELLING:
                System.out.println("售货机正在出货，请稍等");
                break;
            case SELLOUT:
                System.out.println("售货机已经售罄，无法出货");
                break;
        }
    }

    public int payMoney(){
        System.out.println("售货机退钱");
        return 1;
    }

    public String sell(){
        if (count >0){
            count --;
        }else {
            ReentrantLock reentrantLock = new ReentrantLock();
            reentrantLock.lock();
            CURRENT_STATE = SELLOUT;
            reentrantLock.unlock();
        }
        System.out.println("出售一瓶冰红茶");
        return "冰红茶";
    }
}
